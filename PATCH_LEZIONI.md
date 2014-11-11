#[Home](https://github.com/rdgmus/Luxemburg/blob/master/README.md#readme)

#PATCH LEZIONI
_(Solo per sviluppatori!)_

>PATCH da applicare alle nuove lezioni per avere un'applicazione Android che per default contiene una
sola Activity senza Fragments.
L'articolo seguente (author:http://stackoverflow.com/users/3960700/naruto) chiarifica i passi da eseguire
per ottenere tale risultato a partire dai file creati per default da Android Developer Tools.
**Tali passi per altro sono da me già stati eseguiti ottenendo i file di progetto finali che trovate in questa cartella. Potete scaricare la patch e copiarla nella directory della nuova applicazione Android creata.**

>Vedi => [CREA NUOVA LEZIONE](CREA_NUOVA_LEZIONE.md)

##Why eclipse automatically adds appcompat v7 library support whenever i create a new project?


###Eclipse automatically created the appcompat_v7.Because of Kitkat Api launched itself it adds automatically appcompat_v7 and fragment_main.xml.

#Best ways to solve these:
***

#1 - Firstly 
in project,Right click->properties->Android.There you can see the red marked appcompat placed in Reference. Click that and Remove it.
***
#2 - Delete fragment_main.xml and Appcompat 
file created in your Eclipse.
***
#3 - Edit and change your activity_main.xml 
like these:

<?xml version="1.0" encoding="utf-8"?>

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_world" />

</RelativeLayout>
***
#4 - In res/values/styles.xml:

<resources>

    <style name="AppBaseTheme" parent="android:Theme.Light">

    </style>

    <!-- Application theme. -->
    <style name="AppTheme" parent="AppBaseTheme">

    </style>

</resources>
***
#5 -In res/values-v11/styles.xml 
you have to change like these:

<resources>

    <style name="AppBaseTheme" parent="android:Theme.Holo.Light">
    </style>

</resources>
***
#6 - In res/values-v14/styles.xml 
you have to change like these:

  <resources>

    <style name="AppBaseTheme" parent="android:Theme.Light">
    </style>

    <style name="AppTheme" parent="AppBaseTheme">
    </style>

</resources>
***
#7 - Change your menu/main.xml 
like these:

<menu xmlns:android="http://schemas.android.com/apk/res/android" >

    <item
        android:id="@+id/action_settings"
        android:orderInCategory="100"
        android:showAsAction="never"
        android:title="@string/action_settings"/>

</menu>
***
#8 - Finally change your MainActivity.java 
like these:

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

}
#LikeWise you have to do it for creating a new project
