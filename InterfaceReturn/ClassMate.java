package InterfaceReturn;

public class ClassMate {
    OnTeacherComeListen mOnTeacherComeListen;
    public void doTeacherCome(String teacherName){
        mOnTeacherComeListen.onTeacherComeListen(teacherName);
    }
    //set方法赋值
    public void setOnTeacherComeListen(OnTeacherComeListen onTeacherComeListen){
        mOnTeacherComeListen = onTeacherComeListen;
    }

}
