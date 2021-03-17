package pl.kacpergski;

public class FileRepo implements Repo{
@Override
    public void save (String text){
        System.out.println("Save to file:" + text);
    }

    public  void get(){
        System.out.println("Get data from file");
    }
}
