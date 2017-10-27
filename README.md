# Detalii complete despre proiect:
Proiectul nostru este o aplicate Java GUI care permite unui utilizator inregistrat pe aplicatie sa cumpere carti. Aplicatia este lagata la o baza de date. Utilizatorul aplicatiei se poate inregistra,in cazul in care nu are cont. Un utilizator care are treptul de administrator si se logheaza pe aplicatie va intampina o noua interfata GUI special creata pentru el in care poate efectua operatii CRUD pe tabelele din baza de date.
In prezent nu este realizata conexiunea butonului de trimitere comanda(Send Command) cu baza de date(nu realizeaza in baza de date o updatare a tabelei vanzari si inventar) si a field-ului "Total Value" care trebuie sa contina valoarea totala a cartilor din comanda utilizatorului.
Toate tabelele au fost populate cu date generate "random".Nu sunt siruri de caractere random, au un oarecare sens,dar nu sunt date reale.
Tabelele utilizate de aplicatia java sunt: BOOKS,EDITOR,INVENTAR,LIBRARIE,USERSS,VANZARI.Baza de date este SQL, si este lucrata in Oracle PL/SQL 11g.Baza de date contine si triggere, view-uri(unul materializat si unul nematerializat)si indexi(ne ajuta sa afisam datele mult mai rapid,avand foarte multe date: aproximativ 260000 de utilizatori si 500000 de carti)

Autori: Maftei Ervin(maftei.ervin@yahoo.com)
        Negrus Bogdan-Andrei(negrus.bogdan@gmail.com)
