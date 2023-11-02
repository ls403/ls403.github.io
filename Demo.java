package 普通页面;

import java.util.Scanner;

public class Demo {
    private String[][] userBox = {{"zgh","666"},{"xy","111"},{"hq","222"},{"lcw","000"}}; //数组作一个临时数据库（其实是缓存）

    public String login(String user,String password){    //登录检验
        String result = "用户名或密码错误";
        for(int i = 0; i < userBox.length; i++){
            if(userBox[i][0].equals(user) && userBox[i][1].equals(password)){
                result = "登录成功";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Demo demo = new Demo();

        Scanner input = new Scanner(System.in);//用户输入自己登录的账号和密码
        //提示用户输入账号和密码
        System.out.print("请输入账号：");
        String user = input.nextLine();
        System.out.print("请输入密码：");
        String password = input.nextLine();

        //调用方法，进行校验
        String result = demo.login(user,password);
        System.out.println(result);
    }
}

