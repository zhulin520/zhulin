package InterfaceReturn;

import java.rmi.MarshalException;

public class Test {
    public static void main(String[] args) {
        final Me me = new Me();
        me.wantSleep();
        ClassMate classMate = new ClassMate();
        classMate.setOnTeacherComeListen(new OnTeacherComeListen() {
            @Override
            public void onTeacherComeListen(String teacherName) {
                if ("吴老师".equals(teacherName)){
                    me.stopSleep();
                }else if ("王老师".equals(teacherName)){

                    System.out.println("不是班主任，继续睡觉");
                }
            }

            @Override
            public void onTeacherCome() {

            }
        });

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
        me.startSleep();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classMate.doTeacherCome("吴老师");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classMate.doTeacherCome("李老师");
    }
}
