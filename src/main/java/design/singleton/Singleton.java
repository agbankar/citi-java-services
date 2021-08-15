package design.singleton;

import java.io.Serializable;

/*
To illustrate the point, how this idiom prevents from two instances being created when
two thread simultaneously calls the getInstance() method, let's see the theory.
Suppose, thread T1 calls getInstance() very the first time and sees that _instance is
null then it will go inside synchronization block and that point of time it paused.
Now, thread T2 calls getInstance() and it will also see _instance variable null,
but it cannot go inside synchronization block because the lock is held by Thread T1,
which is inside the synchronization block. Now, thread T1 wake up and creates a new instance of
singleton and come out of synchronized block. After this when thread T2 goes inside synchronized block,
it again checks whether _instance is null and this time check fails because _instance
is no more null. So thread T2 comes out of the synchronized block without creating another instance.
 Further calls to this method return from the first check only.


 */
public class Singleton implements Serializable, Cloneable {
    private static volatile Singleton _instance = null;

    private Singleton() {
        //prevent reflection attack
        if (_instance != null) {
            throw new InstantiationError("Creating of this object is not allowed.");
        }
    }

    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    return new Singleton();
                }
            }
        }
        return _instance;
    }

    //prevent serialization attack
    protected Object readResolve() {
        return _instance;
    }

    //prevent cloning attack
    // @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
