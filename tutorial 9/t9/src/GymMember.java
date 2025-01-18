public class GymMember {

    String memberName;
    int sessionsLeft;

    GymMember(){
        this.memberName = null;
        this.sessionsLeft =0;
    }

    GymMember(String memberName,int sessionsLeft){
        this.memberName = memberName;
        this.sessionsLeft =sessionsLeft;
    }

    void bookSession(){
        if (sessionsLeft >0){
            sessionsLeft -=1;
        }  else{
            System.out.println("No sessions left to book.");
        }
    }

    void cancelSession(){
            sessionsLeft +=1;
    }

    void displayMemberInfo(){
        if (sessionsLeft>=1){
            System.out.println("Member Name: "+this.memberName+" Session Left: "+this.sessionsLeft);
        }else{
            System.out.println("No sessions available");
        }
    }



}
