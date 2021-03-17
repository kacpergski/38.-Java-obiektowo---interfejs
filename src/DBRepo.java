public class DBRepo implements Repo {
    @Override
    public void save (String text){
        System.out.println("Save to Data base:" + text);
    }

    public  void get(){
        System.out.println("Get data from Data Base");
    }
}
