// Visitor.java
 class Visitor {
    private String language;
   
    public Visitor() {
    this.language="Unknown";
    }
    public Visitor(String l) {
    this.language=l;
    }
    public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String l) {
    this.language=l;
    }
    public String greet() {
    return "... *generic greeting nod* ...";
    }
   }
   // Domestic.java
    class Domestic extends Visitor {
    public Domestic() {
    super();
    this.setLanguage("Greek");
    }
   
    public String greet() {
    return "Geia sas!";
    }
   }
   // Foreign.java
    class Foreign extends Visitor {
    private String passport;
    private String telephone;
   
    public Foreign() {
    super();
    this.passport="Not registered";
    this.telephone="Not registered";
    }
    public Foreign(String l) {
    super(l);
    this.passport="Not registered";
    this.telephone="Not registered";
    }
    public Foreign(String l, String p, String t) {
    super(l);
    this.passport=p;
    this.telephone=t;
    }
    public String getPassport() {
    return this.passport;
    }
    public void setPassport(String p) {
    this.passport=p;
    }
    public String getTelephone() {
    return this.telephone;
    }
    public void setTelephone(String t) {
    this.telephone=t;
    }
    public String greet() {
    if (getLanguage()=="English")
    return "Hello there!";
    else if (getLanguage()=="French")
    return "Bonjour!";
    else if (getLanguage()=="Italian")
    return "Ciao!";
    else if (getLanguage()=="Chinese")
    return "Ni hao!";
    else
    return "... *generic greeting nod* ...";
    }
   }
   //  main java
     class Main {
    public static void main(String[] args) {
    Visitor group[] = new Visitor[6];
    int i;
   
    group[0]= new Visitor();
    group[1]= new Domestic();
    group[2]= new Foreign("French");
    group[3]= new Foreign("Chinese", "CH15351", "35355- 354353");
    group[4]= new Foreign("English", "UK313", "0024-24155");
    group[5]= new Foreign("Italian", "IT9876", "030-1025135");
    Foreign tmp;
    tmp = (Foreign)group[2];
    tmp.setPassport("FR6436");
    tmp.setTelephone("0027-315363");
    for (i=0; i<6; i++) {
    System.out.println(group[i].greet());
    }
    }
   } 