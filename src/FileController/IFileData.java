/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FileController;


import java.util.List;



/**
 *
 * @author abccc
 */
public interface IFileData<T> {
    //interface ghi file
    void WriteObjectToFile(List<T> objects, String filename);
    //interface đọc file
    List<T> readObjectFromFile(String filename);
    
}
