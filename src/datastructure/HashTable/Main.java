package HashTable;

public class Main {
    public static void main(String[] args){
        int intNum = 10;
        String bn = Integer.toBinaryString(intNum);
        // 对应的二进制数
        System.out.println("Integer.toBinaryString："+bn);
        float floatNum = 10.1f;
        int floatInt =Float.floatToIntBits(floatNum);
        System.out.println("floatInt"+floatInt);

        double doubleNum = 10.2;
        System.out.println("Integer:"+Integer.hashCode(intNum));
        // Float 类型的数据对应的二进制整数

        System.out.println("Float binaryString:"+Float.hashCode(floatNum));
        System.out.println("Float:"+Float.hashCode(floatNum));
        System.out.println("Double:"+Double.hashCode(doubleNum));


        Integer a = 110;
        Float b = 10.1f;
        Long c = 156l;
        Double d = 19.2;
        String e ="jack";
        Person me = new Person(25,180,"zhongshuaihao");
        Person you = new Person(25,180,"zhongshuaihao");
        System.out.println("Integer 110"+a.hashCode());
        System.out.println("Float 10.1f:"+b.hashCode());
        System.out.println("Long 1561 "+c.hashCode());
        System.out.println("Double 19.2"+d.hashCode());
        System.out.println("String jack"+e.hashCode());
        System.out.println("Person me"+me.hashCode());
        System.out.println("me and you is the same object:"+me.equals(you));




    }
}
