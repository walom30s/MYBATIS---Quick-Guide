import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisRead_byID {

/*    public static void main(String args[]) throws IOException{
        int i=1;
        Reader reader=Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlSessionFactory.openSession();

        Student student=(Student)session.selectOne("Student.getById",1);
        //Print the student details
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getBranch());
        System.out.println(student.getPercentage());
        System.out.println(student.getEmail());
        System.out.println(student.getPhone());

        session.commit();
        session.close();
    }*/

}
