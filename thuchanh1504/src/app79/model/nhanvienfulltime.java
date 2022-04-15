package app79.model;


    import app79.util.config;

public class nhanvienfulltime extends nhanvien{
    protected int ngayLamThem;
    protected int chucVu; 

    public nhanvienfulltime(String ten){
        this.ten = ten;
    }

    public nhanvienfulltime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int chucVu){
        this.chucVu = chucVu;
    }

    @Override
    public String loaiNhanVien(){
        if(chucVu == config.NHAN_VIEN_SEP){
            return "Nhan vien sep.";
        } else {
            return "Nhan vien linh.";
        }
    }

    public void tinhLuong(){
        if(chucVu == config.NHAN_VIEN_SEP){
            luong = config.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * config.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = config.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * config.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}

