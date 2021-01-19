package design.factory;

public class FactoryDriver {
    public static void main(String[] args) {
        Policy policy = PolicyFactory.getPolicy(PolicyType.PENSION_POLICY);
        System.out.println(policy.getClass());
    }
}
