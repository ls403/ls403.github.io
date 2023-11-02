package 普通页面;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class yonglaiyanzhengshifouzhengque {
    //设计一个方法 用来登录认证 一维数组
    private String[] userBox1 = new String[]{"zgh","xy","hq","lcw"};
    private int[] passwordBox1 = new int[]{666,000,111,222};

    public String loginForArray(String name, String password){
        for(int i = 0; i < userBox1.length; i++){
            if(userBox1[i].equals(name)){
                if(passwordBox1[i] == Integer.parseInt(password)){
                    return "登录成功";
                }
                break;
            }
        }
        return "登陆失败,用户名或密码错误";
    }

    //设计一个方法 用来登录认证 ArrayList
    private ArrayList<String> userBox2 = new ArrayList<>();
    {
        userBox2.add("zgh-666");
        userBox2.add("xy-000");
        userBox2.add("hq-111");
        userBox2.add("lcw-222");
    }
    public String loginForList(String name,String password){
        for(int i = 0; i < userBox2.size(); i++){
            String[] value = userBox2.get(i).split("-");
            if(value[0].equals(name)){
                if(value[1].equals(password)){
                    return "登录成功";
                }
                break;
            }
        }
        return "登陆失败,用户名或密码错误";
    }

    //设计一个方法 用来登录认证 HashSet
    private HashSet<String> userBox3 = new HashSet<>();
    {
        userBox3.add("zgh-666");
        userBox3.add("xy-000");
        userBox3.add("hq-111");
        userBox3.add("lcw-222");
    }
    public String loginForSet(String name,String password){
        Iterator<String> it = userBox3.iterator();
        while(it.hasNext()){
            String[] value = it.next().split("-");
            if(value[0].equals(name)){
                if(value[1].equals(password)){
                    return "登陆成功";
                }
                break;
            }
        }
        return "登陆失败,用户名或密码错误";
    }

    //设计一个方法 用来登录认证 HashMap
    private HashMap<String,String> userBox4 = new HashMap<>();
    {
        userBox4.put("zgh","666");
        userBox4.put("xy","000");
        userBox4.put("hq","111");
        userBox4.put("lcw","222");
    }
    public String loginForMap(String name,String password){
        int realPassword = Integer.parseInt(userBox4.get(name));
        if (userBox4.get(name) != null && realPassword == (Integer.parseInt(password))) {
            return "登陆成功";
        }
        return "登陆失败,用户名或密码错误";
    }

}
