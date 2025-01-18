public class GymMemberClient {

    public static void main(String[] args) {

        GymMember member1 = new GymMember("Jhon Doe",10);
        GymMember m2 = new GymMember();
        member1.bookSession();
        member1.bookSession();
        member1.bookSession();
        member1.displayMemberInfo();
        member1.cancelSession();
        member1.displayMemberInfo();

        GymMember member2 = new GymMember();

        member2.displayMemberInfo();
    }
}
