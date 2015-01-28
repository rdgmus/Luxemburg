<p><a href="http://rdgmus.github.io/Luxemburg">
          <img src="https://raw.githubusercontent.com/rdgmus/PhpRegistroWeb-1.0/master/images/Cbasso1.png" alt="Key Orchestra">
          </a></p>
#Bacheca delle comunicazioni per gli iscritti al corso _Android - Luxemburg 2014/2015_

Se sei arrivata/o a questa pagina, molto probabilmente sei interessata/o al corso. Qui troverai le comunicazioni dei responsabili del corso agli iscritti.

##Ultima ora...
>###Installata ```Lezione 2```, ora la potete trovare nello ```ZIP``` che potete scaricare da:
[http://rdgmus.github.io/Luxemburg/](http://rdgmus.github.io/Luxemburg/)
***

#Blog:

>##[_```Problematiche``` ```Soluzioni```  ```Richieste```  ```Collaborazioni```_](https://github.com/rdgmus/Luxemburg/issues/)

#Lezioni:

|Lezione|Data|Orario|Presenze|
|-------|----|------|--------|
|[1](https://github.com/rdgmus/Luxemburg/blob/master/BACHECA.md#lezione-1)|~~10 Novembre 2014~~|14:30 16:30|12|
|[2](https://github.com/rdgmus/Luxemburg/blob/master/BACHECA.md#lezione-2)|~~17 Novembre 2014~~|14:30 16:30| 14 |
|[3]()|~~24 Novembre 2014~~|14:30 16:30| 15 |
|[4]()|~~01 Dicembre 2014~~|14:30 16:30| 12 |
|[5]()|~~15 Dicembre 2014~~|14:30 16:30| 6 |
|[6]()|~~12 Gennaio 2015~~|14:30 16:30| 7 |
|[7]()|~~19 Gennaio 2015~~|14:30 16:30| 6 |
|[8]()|~~26 Gennaio 2015~~|14:30 16:30|  |
|[9]()| 2 Febbraio 2015|14:30 16:30|  |

###~~Lezione 1~~
10 Novembre 2014 - 14:30 16:30

```Emulatore``` - ```Android Developer Tools``` - Configurazione del ```layout``` dell'applicazione -
Link del layout al codice java - cattura dell'evento```onClick()```

###~~Lezione 2~~
17 Novembre 2014 - 14:30 16:30

Aggiunta di un ```Menù``` con items
```AboutUs``` & ```Exit```,  e di un ```Button``` per richiamare il ```Menù```. (questo ```Button``` praticamente inutile perchè i device hanno già questa opzione, viene inserito solo a scopo didattico).

###~~Lezione 3~~
24 Novembre 2014 - 14:30 16:30

RIPASSO GENERALE - DOMANDE & RISPOSTE

###~~Lezione 4~~
01 Dicembre 2014 - 14:30 16:30

RIPASSO GENERALE - DOMANDE & RISPOSTE

###~~Lezione 5~~
15 Dicembre 2014 - 14:30 16:30

RIPASSO GENERALE - CREAZIONE MENU
###~~Lezione 6~~
12 Gennaio 2015 - 14:30 16:30

Altri componenti grafici : implementazione e sviluppo;
1. Download di effetti sonori
2. Caricamento e lancio degli effetti sonori in risposta ad un evento click()
3. Salvataggio delle preferenze dell'applicazione
e recupero delle stesse
4. CheckBox, RadioButton, ToggleButton, ...

###~~Lezione 7~~
19 Gennaio 2015 - 14:30 16:30

RadioButton, ToggleButton

###~~Lezione 8~~
26 Gennaio 2015 - 14:30 16:30

RadioButton, ToggleButton

###Lezione 9
02 Febbraio 2015 - 14:30 16:30 ![prossima
lezione](https://raw.githubusercontent.com/rdgmus/Luxemburg/master/images/next%20lesson.png)

Come lanciare una nuova attività e ritornare all'attività precedente recuperando, eventualmente, i risultati forniti dalla stessa.

|Aula|Responsabile|Docente |
|----|------------|--------|
|MAC IPIA ROSA LUXEMBURG MILANO|Gianni Natoli|Roberto Della Grotta |


***
#Domande & Risposte:

##I download in formato zip o tar.gz sono la stessa cosa?

>I download in formato zip o tar.gz sono la stessa cosa, contengono tutti lo stesso codice tra cui la cartella lezione 1 che va aperta da Android Developer Tools e poi installata sull'emulatore.

##Dove si scarica il programma ```Android Developer Tools```?

>il programma per sviluppare le applicazioni sulla propria macchina, ```Android Developer Tools```, si scarica da
http://developer.android.com/sdk/index.html
###Novità:
Il sistema di sviluppo che usiamo noi in classe non è più mantenuto da Eclipse (vuol dire che non vi saranno upgrade ulteriori). Ma nessun problema!
Chi volesse installarlo sul proprio MAC richieda il programma al prof. Della Grotta.
Sul sito di Eclipse è ora presente un nuovo sistema di sviluppo chiamato ```Android Studio``` che utilizzeremo in eventuali corsi futuri.
Chi invece utilizza come sistema operativo Windows dovrà seguire le istruzioni sul sito che consistono in:
1. Effettuare il download e installare Eclipse Luna
2. Effettuare il download e installare il plugin ```Android Developer Tools```

##Come far comparire il menù nell'Android Emulator (```AVD```)?

>Innanzitutto (si puo dire Innanzitutto?), la pagina della quale si vuole aprire il menù, deve contenere un menù, altrimenti non si può visualizzare niente, poi in particolare per far comparire il menù in una pagina che lo preveda, basta premere ```F2```, ma comunque potete trovare tutte le informazioni, riguardanti gli ```Android Emulator Shortcuts``` seguendo questo link, per tutti i sistemi operativi:

>[Android Emulator Shortcuts](http://www.shortcutworld.com/en/linux/Android-Emulator.html)

##Quali sono i colori e i relativi valori ```RGB``` di Android?

>Vedi la tabella: [ANDROID COLORS](https://github.com/rdgmus/Luxemburg/blob/master/ANDROID_COLORS.md)

##Dove posso scaricare il software Eclipse per lo sviluppo di codice in altri linguaggi?

>Le varie versioni dell'IDE Eclipse si differenziano tra di loro per i plugin installati al loro interno. Ad ogni modo nel link [Eclipse IDE](http://www.eclipse.org/downloads) potete trovare la versione che Vi interessa in base al linguaggio di programmazione che volete utilizzare, per sviluppare il Vs. codice.

##Quando tento di lanciare il mio Android Virtual Device (AVD) l'IDE dice che non trova l'SDK (Software Development Kit). Cosa fare?

>Devi andare nelle preferenze dell'ADT Eclipse:
```Preferences => Android => SDK Location```
La SDK Location si trova sotto la cartella dell'ADT Bundle scaricato (il nostro sistema di sviluppo)
nella cartella SDK. Basta selezionare questa cartella e premere invio. L'ADT dovrebbe riconoscere l'SDK come valido. A questo punto potete chiudere il menù Preferences e lanciare il Vs. AVD. _(Ho usato il verbo al condizionale perchè dipende da quale API Level state utilizzando per creare il codice Android. Potrebbe essere richiesto un upgrade dell'SDK ma non lo consiglio perchè richiede un pò di tempo e pazienza illimitata. Comunque nel nostro corso con l'API Level 19 non dovrebbero, appunto, esserci problemi. Le release di Eclipse sono aggiornate di frequente e potrebbero esserci delle nuove release e nuovi problemi. Se siete in difficoltà usate la release che abbiamo installato nel laboratorio MAC del corso, chiedendo al responsabile di laboratorio o ai docenti. Grazie! )_
***

#Video CORSO ANDROID-LUXEMBURG

##Come creare una ```Nuova Applicazione Android``` in Eclipse IDE?

[![ScreenShot](https://raw.githubusercontent.com/rdgmus/Luxemburg/master/video%20clip/CreaNuovaLezione.png)](http://youtu.be/ynEd7VNAZ5Y)

##Come attivare l'```Assistente di Codice Inline`` in Eclipse IDE?

[![ScreenShot](https://raw.githubusercontent.com/rdgmus/Luxemburg/master/video%20clip/InlineCodeAssist.png
  )](http://youtu.be/uFNrv4QPUc0)
