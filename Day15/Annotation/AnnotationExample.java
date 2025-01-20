package Day15.Annotation;

import java.lang.reflect.Method;

public class AnnotationExample {

    @CustomAnno(message = "This is custom annotation")
    public void setMessage()
    {

    }

    public static void main(String[] args) {
        try {
            Class classobj = Class.forName("Day15.Annotation.AnnotationExample");
            Method method[] = classobj.getDeclaredMethods();
            for (Method method1 : method) {
                System.out.println(method1);
                if(method1.getName().indexOf("setMessage") != -1)
                {
                    CustomAnno customAnno = method1.getAnnotation(CustomAnno.class);
                    System.out.println(customAnno.message());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
