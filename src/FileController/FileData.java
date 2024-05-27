/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileController;

import Model.TaiKhoan;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileData<T> implements IFileData<T>{
@Override
    public void WriteObjectToFile(List<T> objects, String filename) {
       try {
            // Tạo một FileOutputStream để ghi file
            FileOutputStream fileOut = new FileOutputStream(filename);

            // Tạo một ObjectOutputStream để ghi các đối tượng vào file
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Ghi danh sách các đối tượng vào file
            out.writeObject(objects);

            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }

    @Override
    public List<T> readObjectFromFile(String filename) {
         File file = new File(filename);
        if (!file.exists()) {
            return new ArrayList<>(); // Return an empty list if the file doesn't exist
        }
         try {
            // Tạo một FileInputStream để đọc file
            FileInputStream fileIn = new FileInputStream(filename);

            // Tạo một ObjectInputStream để đọc các đối tượng từ file
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Đọc danh sách các đối tượng từ file
            @SuppressWarnings("unchecked")
            List<T> people = (List<T>) in.readObject();

            in.close();
            fileIn.close();
            return people;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    
}
