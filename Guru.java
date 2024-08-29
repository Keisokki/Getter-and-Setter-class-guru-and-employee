//Object Class

public class Guru {
    private String nama;
    private String mapel;
    private String alamat;
    private int id;

    public Guru(){
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }

    public Guru(String nama, String mapel, String alamat, int id){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    public void print(){
        System.out.println("--------------------------------");
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Mata Pelajaran : " + mapel);
        System.out.println("Alamat : " + alamat);
        System.out.println("--------------------------------");
    }

    /**
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return String return the mapel
     */
    public String getMapel() {
        return mapel;
    }

    /**
     * @param mapel the mapel to set
     */
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    /**
     * @return String return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public String print2() {
        return "ID: " + id
        + "\nNama: " + nama
        + "\nMata Pelajaran: " + mapel
        + "\nAlamat: " + alamat;
        
    }

}
