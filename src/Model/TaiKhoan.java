/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author abccc
 */
public class TaiKhoan implements Serializable {
    private String TenDN;
    private String MatKhau;

    public TaiKhoan(String TenDN, String MatKhau) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
    }

    public TaiKhoan() {
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTenDN() {
        return TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.TenDN, other.TenDN)) {
            return false;
        }
        return Objects.equals(this.MatKhau, other.MatKhau);
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "TenDN=" + TenDN + ", MatKhau=" + MatKhau + '}';
    }
    
    
}
