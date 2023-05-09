package dependence_inversion_principle.inversion1;

public class DependenceInversionPrinciple {
    public static void main(String[] args) {
        Person person=new Person();
        Email email=new Email();
        WeiXin weiXin=new WeiXin();

        person.receive(email);
        person.receive1(weiXin);
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息";
    }
}
class WeiXin{
    public String getInfo(){
        return "微信信息";
    }
}

/**
 * 完成Person接收信息的功能
 * 1.如果获取对象是邮件、微信等等，则Person类就要增加相应的方法
 * 2.解决方案：引入抽象接口IReceive，与Person类发生依赖，让Email，WeiXin实现IReceive，实现依赖倒转
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
    public void receive1(WeiXin weiXin){
        System.out.println(weiXin.getInfo());
    }
}