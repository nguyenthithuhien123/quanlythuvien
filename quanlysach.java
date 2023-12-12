package quanlythuvien;

public class quanlysach {
    private String tieude;
    private String tensach;
    private String tentacgia;
    private String id;
    private int giatien;

    public quanlysach(String tieude, String tensach, String tentacgia, String id, int giatien) {
        this.tieude = tieude;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.id = id;
        this.giatien = giatien;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public void hienthilistsach() {
        System.out.println("Tiêu đề sách: " + tieude+" ||___Tên sách: " + tensach+"||___Tên tác giả: " + tentacgia+" ||___Id: " + id+" ||___Giá sách: " + giatien);

    }


}
