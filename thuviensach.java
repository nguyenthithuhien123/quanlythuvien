package quanlythuvien;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class thuviensach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/******************************   list sách   *****************************/

        quanlysach sach1 = new quanlysach("cuộc sống", "dòng sông", "thu hiên", "01", 120000);
        quanlysach sach2 = new quanlysach("khoa hoc", "Địa cầu", "Kiều vy", "02", 130000);
        quanlysach sach3 = new quanlysach("địa lý", "Việt nam", "Tường Vy", "03", 150000);
        quanlysach sach4 = new quanlysach("Điện ảnh", "Phim", "Quỳnh hoa", "04", 170000);
        quanlysach sach5 = new quanlysach("Kinh doanh", "Làm giàu", "Vượng", "05", 110000);
        quanlysach sach6 = new quanlysach("Nghề nghiêp", "Giáo viên", "thu hiên", "06", 190000);

        quanlysach[] listBook = new quanlysach[6];
        listBook[0] = sach1;
        listBook[1] = sach2;
        listBook[2] = sach3;
        listBook[3] = sach4;
        listBook[4] = sach5;
        listBook[5] = sach6;


        /******************************  list tác giả  *****************************/
        quanlytacgia author1 = new quanlytacgia("thu hiên", "01", 25);
        quanlytacgia author2 = new quanlytacgia("Kiều vy", "02", 26);
        quanlytacgia author3 = new quanlytacgia("Tường Vy", "03", 27);
        quanlytacgia author4 = new quanlytacgia("Quỳnh hoa", "04", 28);
        quanlytacgia author5 = new quanlytacgia("Vượng", "05", 29);
        quanlytacgia author6 = new quanlytacgia("Hà", "06", 30);

        quanlytacgia[] listauthor = new quanlytacgia[6];
        listauthor[0] = author1;
        listauthor[1] = author2;
        listauthor[2] = author3;
        listauthor[3] = author4;
        listauthor[4] = author5;
        listauthor[5] = author6;


        System.out.println("Nhập 1 để truy cập vào Quản lý tác giả");
        System.out.println("Nhập 2 để truy cập vào Quản lý sách");

        int menu;
        int menu_quanlysach;
        int menu_quanlytacgia;
        do {
            System.out.println("nhập lại 1 hoặc 2");
            menu = sc.nextInt();
        } while (menu != 1 & menu != 2);
        switch (menu) {
            case 1:

                System.out.println("****** Quản lý tác giả ******");
                System.out.println();
                System.out.println("Chọn các mục từ 1-5: ");
                System.out.println("1 - Thêm tác giả");
                System.out.println("2 - Hiển thị tác giả");
                System.out.println("3 - Cập nhập thông tin tác giả theo id");
                System.out.println("4 - Xóa tác giả (không xóa tác giả đã có sách");
                System.out.println("5 - Về thư viện sách");
                System.out.println("Mời bạn chọn");
                do {
                    System.out.println("nhập mục 1-5");
                    menu_quanlytacgia = sc.nextInt();
                } while (menu_quanlytacgia != 1 && menu_quanlytacgia != 2 && menu_quanlytacgia != 3 && menu_quanlytacgia != 4 && menu_quanlytacgia != 5);
                switch (menu_quanlytacgia) {
                    case 1:
                        /****************************** 1.1 thêm tác giả  *****************************/
                        System.out.println("nhập số tác giả cần thêm");
                        Scanner SC = new Scanner(System.in);
                        int m = Integer.parseInt(SC.nextLine());
                        quanlytacgia[] listyaddAuthor = new quanlytacgia[m];
                        for (int i = 0; i < m; i++) {
                            System.out.println("Nhập id: ");
                            String id_Author = SC.nextLine();
                            System.out.println("Nhập tuổi: ");
                            int tuoiAuthor = SC.nextInt();
                            System.out.println("Nhập tên tác giả: ");
                            String tentg = SC.nextLine();
                            quanlytacgia addAuthor = new quanlytacgia(tentg, id_Author, tuoiAuthor);
                            listyaddAuthor[i] = addAuthor;
                        }
                        quanlytacgia[] newlistAuthor = new quanlytacgia[listauthor.length + m];
                        for (int i = 0; i < newlistAuthor.length; i++) {
                            if (i < listauthor.length) {
                                newlistAuthor[i] = listauthor[i];
                            } else for (int j = 0; j < listyaddAuthor.length; j++) {
                                newlistAuthor[listBook.length + j - 1] = listyaddAuthor[j];
                            }
                        }
                        for (int i = 0; i < newlistAuthor.length; i++) {
                            if (newlistAuthor[i] != null)
                                newlistAuthor[i].author();
                        }

                    case 2:
                        /******************************  2.1 hiển thị tác giả *****************************/
                        for (int j = 0; j < listauthor.length; j++) {
                            listauthor[j].author();
                        }
                    case 3:
                        /*************** 1.3 Cập nhật tác giả theo id ************/
                        System.out.println("Nhập id tác giả cần cập nhật");
                        String author_Uppdate = sc.nextLine();
                        for (int i = 0; i < listauthor.length; i++) {
                            if (author_Uppdate.toUpperCase() == listauthor[i].getId().toUpperCase()) {
                                System.out.println("Nhập tên tác giả: ");
                                String nameAuthor_uppdate = sc.nextLine();
                                listauthor[i].setName(nameAuthor_uppdate);
                                System.out.println("Nhập tuổi tác giả: ");
                                int ageAuthor_Upddate = sc.nextInt();
                                listauthor[i].setAge(ageAuthor_Upddate);
                                listauthor[i].getId();
                            } else System.out.println("Không có tác giả nào trùng với id " + author_Uppdate);
                        }
                    case 4:
                        /**************** 1.4 xóa tác giả không có sách*********/
   /*     System.out.println("Nhập tên tác giả muốn xóa \"chỉ xóa tác giả không có sách\"");
        String checkTacgia = sc.nextLine();
        boolean kiemtra = true;
        for (int j = 0; j < listauthor.length; j++) {
            if (checkTacgia.toUpperCase().equals(listauthor[j].getName().toUpperCase())) {
                break;
            } else kiemtra = false;
        }
        if (kiemtra == false) {
            System.out.println("Không có tác giả nào tên là " + checkTacgia);
        } else {
            for (int i = 0; i < listBook.length; i++) {
                if (checkTacgia.toUpperCase().equals(listBook[i].getTentacgia().toUpperCase())) {
                    kiemtra = false;
                    break;
                } else System.out.println("Tác giả có sách không thể xóa được");
            }
        }

        if (kiemtra) {
            for (int i = 0; i < listauthor.length; i++) {
                if (checkTacgia.toUpperCase().equals(listauthor[i].getName().toUpperCase())) {

                }else ;
            }
        }*/
                    default:
                }
            case 2:
                System.out.println("****** Quản lý sách ******");
                System.out.println();
                System.out.println("Chọn các mục từ 1-6: ");
                System.out.println("1 - Thêm sách");
                System.out.println("2 - Hiển thị sách");
                System.out.println("3 - Tìm kiếm sách theo tiêu đề");
                System.out.println("4 - Tìm kiếm sách theo tên giác giả");
                System.out.println("5 - Cập nhập sách (theo id)");
                System.out.println("6 - về thư viện");
                System.out.println("Mời bạn chọn");
                menu_quanlysach = sc.nextInt();
                do {
                    System.out.println("nhập mục 1-6");
                    menu_quanlysach = sc.nextInt();
                } while (menu_quanlysach != 1 && menu_quanlysach != 2 && menu_quanlysach != 3 && menu_quanlysach != 4 && menu_quanlysach != 5 && menu_quanlysach != 6);
                switch (menu_quanlysach) {
                    case 1:
                        /********************   2.1  thêm sách   ***************************/

                        System.out.println("nhập số lượng sách cần thêm");
                        //   int n = sc.nextInt();
                        int n = Integer.parseInt(sc.nextLine());
                        quanlysach[] addlistbook = new quanlysach[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhập id: ");
                            String id = sc.nextLine();
                            System.out.println("Nhập tiêu đề: ");
                            String tieude = sc.nextLine();
                            System.out.println("Nhập tên sách: ");
                            String tensach = sc.nextLine();
                            System.out.println("Nhập tên tác giả: ");
                            String tentg = sc.nextLine();
                            System.out.println("Nhập giá tiền: ");
                            int gia = sc.nextInt();
                            quanlysach addbook = new quanlysach(tieude, tensach, tentg, id, gia);
                            addlistbook[i] = addbook;
                        }
                        quanlysach[] newlistbook = new quanlysach[listBook.length + n];
                        for (int i = 0; i < newlistbook.length; i++) {
                            if (i < listBook.length) {
                                newlistbook[i] = listBook[i];
                            } else for (int j = 0; j < addlistbook.length; j++) {
                                newlistbook[listBook.length + j - 1] = addlistbook[j];
                            }
                        }
                        for (int i = 0; i < newlistbook.length; i++) {
                            if (newlistbook[i] != null)
                                newlistbook[i].hienthilistsach();
                        }
                    case 2:
                        /***************  hiển thị sách  ****************/
                        for (int i = 0; i < listBook.length; i++) {
                            listBook[i].hienthilistsach();
                        }
                    case 3:
                        /*************** tìm kiếm sách theo tiêu đề ***/
                        System.out.println("Nhập tên sách bạn muốn tìm: ");
                        String finebooktitle = sc.nextLine();
                        for (int i = 0; i < listBook.length; i++) {
                            if (finebooktitle.toUpperCase().equals(listBook[i].getTieude().toUpperCase())) {
                                listBook[i].hienthilistsach();
                                break;
                            } else System.out.println("không có sách bạn muốn tìm");
                        }

                    case 4:
                        /****************************** 2.3 tìm kiếm sách theo tác giả  *****************************/
                        System.out.println("Nhập tên sách bạn muốn tìm: ");
                        String finebookauthor = sc.nextLine();
                        for (int i = 0; i < listBook.length; i++) {
                            if (finebookauthor.toUpperCase().equals(listBook[i].getTentacgia().toUpperCase())) {
                                listBook[i].hienthilistsach();
                                break;
                            } else System.out.println("không có sách bạn muốn tìm");
                        }

                    case 5:
                        /******************** 2.4  cập nhật sách theo id******************/
                        System.out.println("Nhập id sách muốn cập nhật");
                        String idupdate = sc.nextLine();
                        for (int i = 0; i < listBook.length; i++) {
                            String k = listBook[i].getId();
                            if (idupdate.equals(k)) {
                                System.out.println("Nhập tiêu đề: ");
                                String tieude = sc.nextLine();
                                listBook[i].setTieude(tieude);
                                System.out.println("Nhập tên sách: ");
                                String tensach = sc.nextLine();
                                listBook[i].setTensach(tensach);
                                System.out.println("Nhập tên tác giả: ");
                                String tentg = sc.nextLine();
                                listBook[i].setTentacgia(tentg);
                                System.out.println("Nhập giá tiền: ");
                                int gia = sc.nextInt();
                                listBook[i].setGiatien(gia);
                            }
                        }
                        System.out.println("Danh sách");
                        for (int i = 0; i < listBook.length; i++) {
                            listBook[i].hienthilistsach();
                        }
                }
            default:
        }




        /*
         * Viết chương trình Java quản lý thư viện. Quản lý 2 loại thông tin về sách và tác giả
         * Menu chính
         *      1. Quản lý tác giả
         *      2. Quản lý sách
         *      3. Thoát
         * Khi chọn menu 1. Quản lý tác giả
         *      1. Thêm tác giả
         *      2. Hiển thị tác giả
         *      3. Cập nhật thông tin tác giả (theo id)
         *      4. Xóa tác giả (Không xóa tác giả có đã sách)
         *      5. Quay lại (quay trở về menu chính)
         * Khi chọn menu 2. Quản lý sách
         *      1. Thêm sách
         *      2. Tìm kiếm sách theo tiêu đề
         *      3. Tìm kiếm sách theo tên tác giả
         *      4. Cập nhật sách (theo id)
         *      5. Quay lại (Quay về menu chính)
         */


    }
}
