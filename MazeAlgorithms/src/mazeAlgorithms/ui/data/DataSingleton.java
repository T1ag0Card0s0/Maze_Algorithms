package mazeAlgorithms.ui.data;


public class DataSingleton {
    private static DataSingleton _instance = null;
    private MazeManager mazeManager;
    private DataSingleton(){
        this.mazeManager = new MazeManager();
    }
    public static DataSingleton getInstance(){
        if(_instance==null)_instance=new DataSingleton();
        return _instance;
    }
    public MazeManager getManager(){return this.mazeManager;}    
}
