/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abccc
 */
public class ThietBiHoTro extends ThietBi{
    
    private int TinhTrangHoatDong;
    private int DiemTuoiTho;
    private int DiemTieuHao;
    private int DiemHieuSuat;
    private int DiemHuHong;
    private int DiemBaoTri;
    
    

    public ThietBiHoTro(int TinhTrangHoatDong, int DiemTuoiTho, int DiemTieuHao, int DiemHieuSuat, int DiemHuHong, int DiemBaoTri, String MaTb,String TenDN, String MatKhau, String TenTb, int SoLuong, int NamSX , String LoaiThietBi, String GhiChu) {
        super(MaTb, TenDN, MatKhau, TenTb, SoLuong, NamSX,LoaiThietBi, GhiChu);
        this.TinhTrangHoatDong = TinhTrangHoatDong;
        this.DiemTuoiTho = DiemTuoiTho;
        this.DiemTieuHao = DiemTieuHao;
        this.DiemHieuSuat = DiemHieuSuat;
        this.DiemHuHong = DiemHuHong;
        this.DiemBaoTri = DiemBaoTri;
    }

    public ThietBiHoTro() {
        
    }

    
    

    public int getTinhTrangHoatDong() {
        return TinhTrangHoatDong;
    }

    public int getDiemTuoiTho() {
        return DiemTuoiTho;
    }

    public int getDiemTieuHao() {
        return DiemTieuHao;
    }

    public int getDiemHieuSuat() {
        return DiemHieuSuat;
    }

    public int getDiemHuHong() {
        return DiemHuHong;
    }

    public int getDiemBaoTri() {
        return DiemBaoTri;
    }

    public void setTinhTrangHoatDong(int TinhTrangHoatDong) {
        this.TinhTrangHoatDong = TinhTrangHoatDong;
    }

    public void setDiemTuoiTho(int DiemTuoiTho) {
        this.DiemTuoiTho = DiemTuoiTho;
    }

    public void setDiemTieuHao(int DiemTieuHao) {
        this.DiemTieuHao = DiemTieuHao;
    }

    public void setDiemHieuSuat(int DiemHieuSuat) {
        this.DiemHieuSuat = DiemHieuSuat;
    }

    public void setDiemHuHong(int DiemHuHong) {
        this.DiemHuHong = DiemHuHong;
    }

    public void setDiemBaoTri(int DiemBaoTri) {
        this.DiemBaoTri = DiemBaoTri;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThietBiHoTro other = (ThietBiHoTro) obj;
        return true;
    }
    public int TongDiem(){
        return this.DiemBaoTri+this.DiemHieuSuat+this.DiemHuHong+this.DiemTieuHao+this.DiemTuoiTho+this.TinhTrangHoatDong;
    }
    @Override
    public String getDanhGia(){
        if(TongDiem()>=6 && TongDiem()<=12){
            return "Thiết bị cần bảo trì ngay lập tức";
        }else if(TongDiem()>=13&&TongDiem()<=18){
            return "Thiêt bị cần bảo trì định kỳ";
        }else if(TongDiem()==0){
            return "Chưa đánh giá" ;
        }else{
            return "Thiết bị chưa cần bảo trì";
        }
    }

    @Override
    public String toString() {
        return "ThietBiHoTro{" + "TinhTrangHoatDong=" + TinhTrangHoatDong + ", DiemTuoiTho=" + DiemTuoiTho + ", DiemTieuHao=" + DiemTieuHao + ", DiemHieuSuat=" + DiemHieuSuat + ", DiemHuHong=" + DiemHuHong + ", DiemBaoTri=" + DiemBaoTri + '}';
    }
    
}
