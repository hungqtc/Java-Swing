/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMVC;

/**
 *
 * @author Fox0fNight
 */
public class MenuController {
     private StudentController st_contrl;
    private MenuView mnview;

    public MenuController() {
    }

    public MenuController(StudentController st_contrl) {
        this.st_contrl = st_contrl;
    }

    public MenuController(StudentController st_contrl, MenuView mnview) {
        this.st_contrl = st_contrl;
        this.mnview = mnview;
    }
    
    
    
    public void lua_chon_menu(){
        int kq = mnview.hien_thi_menu();
        
        switch(kq){
            case 1: 
                st_contrl.nhapdanhsachSV();
                break;
            case 2:
                st_contrl.tim_kiem_sv_theo_sdt();
                break;
            case 3:
                System.out.println("Thoat");break;
            default: 
                System.out.println("ERROR");break;
        }
    }
    
}
