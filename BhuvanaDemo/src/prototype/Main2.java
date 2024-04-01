package prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//use prototype pattern when you need to do a lot of copy work
//or a lot of objects they use a lot of common values
public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ExamPaperController controller = new ExamPaperController();
        ExamPaper paper1 = controller.createPaper("Jack");
        ExamPaper paper2 = controller.createPaper("Tom");

        System.out.println(paper1);
        System.out.println(paper2);
    }
}

//exam paper
//we have same questions -- use question bank as prototype
//then copy to create different paper for different student
//by shuffling the questions
class Question{
    private String key;
    private String answer;

    public Question(String key, String answer) {
        this.key = key;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question:" +
                "key:'" + key + '\'' +
                ", answer:'" + answer + '\'';
    }
}

//to create exam paper: 5 questions + 1 student name
class ExamPaper implements Cloneable{
    //List-ArrayList,LinkedList,Vector
    private ArrayList<Question> list = new ArrayList<>();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getList() {
        return list;
    }

    public void append(Question q){
        list.add(q);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {//🌟
        ExamPaper paper = (ExamPaper) super.clone();
        paper.list = (ArrayList<Question>) list.clone();
        Collections.shuffle(paper.list);
        return paper;
    }

    @Override
    public String toString() {
        String str = "the Exam paper for "+ name+" are:\n";
        for(int i=0 ; i<list.size() ; i++){
            str += "Question "+(i+1) +"." +list.get(i) +"\n";
        }
        str+="\n";
        return str;
    }
}

class ExamPaperController{
    private final ExamPaper originalPaper = new ExamPaper();
    public ExamPaperController(){
        originalPaper.append(new Question("1+1=?","2"));
        originalPaper.append(new Question("2+3=?","5"));
        originalPaper.append(new Question("1+91=?","92"));
        originalPaper.append(new Question("4+9=?","13"));
        originalPaper.append(new Question("7+8=?","15"));
    }

    public ExamPaper createPaper(String name) throws CloneNotSupportedException {
        //the new exam paper should be the copy of originalPaper
        ExamPaper newPaper = (ExamPaper) originalPaper.clone();
        newPaper.setName(name);
        return newPaper;
    }
}














