public class Car {
    private int id;
    private String avtonaumber;

    public Car(int id, String avtonaumber) {
        this.id = id;
        this.avtonaumber = avtonaumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvtonaumber() {
        return avtonaumber;
    }

    public void setAvtonaumber(String avtonaumber) {
        this.avtonaumber = avtonaumber;
    }

    @Override
    public String toString() {
        return
              "Сar:"+"\n"+  "id="              + id +"\n"+
                "avtonaumber="     + avtonaumber
                ;
    }
}
