package app79.model;

    import app79.util.Configs;
public class nhanvienparttime extends nhanvien{
    private int gioLamViec;

    public nhanvienparttime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loainhanvien(){
        return "Nhan vien thoi vu.";
    }

    public void tinhLuong(){
        luong = config.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}

