package design.factory;

public class PolicyFactory {

    public static Policy getPolicy(PolicyType p){
        if (p== PolicyType.OTHER_POLICY)
            return new OtherPolicy();
        if (p== PolicyType.PENSION_POLICY)
            return new PensionPolicy();

        return null;
    }
}
