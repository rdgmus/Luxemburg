#[Home](README.md)

#Come creare una nuova lezione per il corso Android
[1. Scarica sul desktop/scrivania lo ZIP contenente la PATCH ](https://github.com/rdgmus/Luxemburg/blob/master/CREA_NUOVA_LEZIONE.md#1-scaricare-sul-desktopscrivania-lo-zip-contenente-la-patch-volgarmente-toppa-da-utilizzare-per-settare-i-parametri-iniziali-della-lezione-salvare-lo-zip-ed-estrarre-il-codice-unzip-annotare-la-posizione-della-cartella-per-il-punto-2)

[2. Crea nuovo progetto](https://github.com/rdgmus/Luxemburg/blob/master/CREA_NUOVA_LEZIONE.md#2-creare-il-nuovo-progetto-di-applicazione-android-con-lopzione-crea-da-codice-esistente-questo-ci-porter%C3%A0-ad-individuare-la-cartella-lezione-patch-dal-quale-estrarre-il-codice-al-termine-di-questa-procedura-ci-troveremo-con-un-nuovo-progetto-avente-il-nome-che-abbiamo-digitato-durante-la-creazione-nel-nostro-workspace-sotto-eclipse-ide)
>
Tutti i passi elencati vanno eseguiti correttamente e nell'ordine per avere una lezione pronta per essere corredata del nostro codice personale e quindi ben inizializzata per gli scopi del corso di istruzione su _Android Developer Tools_


##1. Scaricare sul desktop/scrivania lo _ZIP_ contenente la PATCH (_volgarmente toppa_) da utilizzare per settare i parametri iniziali della lezione. Salvare lo zip ed estrarre il codice (_UNZIP_). Annotare la posizione della cartella per il punto (2)

###Vai su ... 
[GitHub Luxemburg repository](https://github.com/rdgmus/Luxemburg)
![Crea Lezione passo 1.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo1.1.png)

###Scarica lo zip
![Crea Lezione passo 1.2](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo1.2.png)

###Salva ed estrai lo zip
![Crea Lezione passo 1.3](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo1.3.png)

##2. Creare il nuovo progetto di applicazione Android, con l'opzione _[CREA DA CODICE ESISTENTE]_; questo ci porterà ad individuare la cartella _[LEZIONE PATCH]_ dal quale estrarre il codice. Al termine di questa procedura ci troveremo con un nuovo progetto avente il nome che abbiamo digitato durante la creazione, nel nostro _workspace_ sotto Eclipse IDE.

###_FILE => NEW=> OTHER_
Scegli un altro tipo di progetto _Android Application_
![Crea Lezione passo 2.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.1.png)

###_ANDROID PROJECT FROM EXISTING CODE_
Nello specifico seleziona _Android Project from existing code_
![Crea Lezione passo 2.2](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.2.png)

###_BROWSE_ 
Si apre la finestra sul vs. Mac per individuare la cartella _Lezione PATCH_ contenuta nello _ZIP_ che hai scaricato al punto (2) e di cui hai preso nota. 
![Crea Lezione passo 2.3](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.3.png)

###Seleziona _Lezione PATCH => Apri_
Seleziona la cartella e clicca _Apri_
![Crea Lezione passo 2.4](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.4.png)

###_New Project Name_
Cambiamo il nome del progetto nella colonna _Project Name_ della tabella che è apparsa sul monitor; nel nostro caso il nome sarà la stringa _Lezione{seguita dal numero della lezione}_
Selezionare la checkbox _Copy Project into Workspace_ 
![Crea Lezione passo 2.5](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.5.png)

###_Select Project To Import => Finish_
Selezionare la riga del progetto nella tabella e cliccare _Finish_
![Crea Lezione passo 2.6](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo2.6.png)

##3. Cambiamo nome al package contenente _MainActivity.java_ , sotto la cartella _/src_
![Crea Lezione passo 3.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo3.1.png)

![Crea Lezione passo 3.2](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo3.2.png)

![Crea Lezione passo 3.3](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo3.3.png)

![Crea Lezione passo 3.4](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo3.4.png)

##4. Modificiamo se necessario i nomi dei package utilizzati da _MainActivity.java_
![Crea Lezione passo 4.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo4.1.png)
![Crea Lezione passo 4.2](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo4.2.png)

##5. Cambiamo nome al package nel file _AndroidManifest.xml_
![Crea Lezione passo 5.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20Lezione%20passo5.1.png)

##6. Rinominare il file _Lezione[num. lezione].apk_ appropriatamente
![Crea Lezione passo 6.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo6.1.png)
![Crea Lezione passo 6.2](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo6.2.png)
![Crea Lezione passo 6.3](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo6.3.png)
![Crea Lezione passo 6.4](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo6.4.png)

##7. Cambiare la stringa che da il titolo all'applicazione e che compare nell'header del tablet o smartphone o comunque nell'emulatore, appropriatamente.
![Crea Lezione passo 7.1](https://github.com/rdgmus/Luxemburg/blob/master/images/Crea%20lezione%20passo7.1.png)
