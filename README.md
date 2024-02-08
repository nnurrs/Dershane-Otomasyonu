# Dershane Otomasyonu  

Java progarmlama dili ile geliştirilen, bir dershaneye kaydolan öğrencileri ve bu dershanede verilen derslerin takip edilebilmesini sağlayan bir otomasyondur. 
Bu dershanede birçok ders verilmektedir. Dershaneye kaydolan öğrenci bir veya birden fazla derse kaydolabilmektedir. 
Öğrenci bilgileri, ders bilgileri ve öğrencilerin kaydolduğu ders bilgileri tutulacaktır.  

Ogrenci.java ve Ders.java sınıfları, Kapsülleme (Encapsulation) özelliklerini sağlamaktadır.  

Dosya okuma işlemi sona erdikten sonra kullanıcıya aşağıdaki gibi bir menü sunulmaktadır:  
**1 – Ders Ekle():** Kullanıcıdan alına ders, dersler array list'ine eklenir.  
**2 – Ders Listele():** Ders bilgileri ekrana yazdırılır.  
**3 – Ders Ara():** Kullanıcıdan alınan ders adına göre arama yapılır ve listelenir.  
**4 – Ders Sil():** Kullanıcıdan alınan ders adına göre ilgili ders silinir.  
**5 – Öğrenci Ekle():** Kullanıcıdan alınan öğrenci bilgileri, Ogrenciler array list'ine eklenir.  
**6 – Öğrenci Ara():** Kullanıcıdan alınan öğrenci ad-soyadına göre arama yapılır ve listelenir.  
**7 – Öğrenci Sil():** Kullanıcıdan alınan ders adına göre ilgili öğrenci silinir.  
**8 – Öğrenci Listele():** Öğrenci bilgileri ekrana yazdırılır.  
**9 – Öğrencileri Ayrıntılı Listele():** Listedeki öğrenciler ve aldıkları ders bilgileri ekrana yazdırılır.  
**10 – Öğrencilerin Ödeyeceği Tutarı Hesapla():** Kullanıcıdan alınan Id bilgisine göre öğrencinin dershaneye ödeyeceği aylık toplam ücret hesaplanır.
Her ders ücreti haftalık 400 TL’dir. Kurs kampanyaları şu şekildedir:   
    *- Kampanya 1:* Bu kampanya 2 ders alan öğrenciler içindir. Bu öğrencilere ikinci ders %5 indirimlidir.  
    *- Kampanya 2:* Bu kampanya 3 ders alan öğrenciler içindir. Bu öğrencilere 3. ders %15 indirimlidir.  
    *- Kampanya 3:* Bu kampanya 3 ders üstü alan öğrenciler içindir. Bu öğrencilere ise her ders %10 indirimlidir.  
**11 - Çıkış():** Ogrenciler listesindeki öğreci bilgileri ogrenci.txt dosyasına, Dersler listesindeki ders bilgileri ders.txt dosyasına yazılır. Dosyaya yazma işlemi yapılacağı zaman, dosyadaki 
önceki kayıtlar silinir ve yeni bilgiler yazılır. 


