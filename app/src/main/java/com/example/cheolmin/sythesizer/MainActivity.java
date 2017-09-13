package com.example.cheolmin.sythesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, eScale;
    private Button aButtonHigh, asButtonHigh, bButtonHigh, cButtonHigh, csButtonHigh, dButtonHigh, dsButtonHigh, eButtonHigh, fButtonHigh, fsButtonHigh, gButtonHigh, gsButtonHigh;
    private Button arrayScale, twinkleStar, alwaysWithMe;

    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote;
    private MediaPlayer aNoteHigh, asNoteHigh, bNoteHigh, cNoteHigh, csNoteHigh, dNoteHigh, dsNoteHigh, eNoteHigh, fNoteHigh, fsNoteHigh, gNoteHigh, gsNoteHigh;
    MediaPlayer mp [] = new MediaPlayer[24];//make array

    private NumberPicker numPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();


    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_a_sharp);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_c_sharp);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_d_sharp);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_f_sharp);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_g_sharp);
        aButtonHigh = (Button) findViewById(R.id.button_a_high);
        asButtonHigh = (Button) findViewById(R.id.button_a_sharp_high);
        bButtonHigh = (Button) findViewById(R.id.button_b_high);
        cButtonHigh = (Button) findViewById(R.id.button_c_high);
        csButtonHigh = (Button) findViewById(R.id.button_c_sharp_high);
        dButtonHigh = (Button) findViewById(R.id.button_d_high);
        dsButtonHigh = (Button) findViewById(R.id.button_d_sharp_high);
        eButtonHigh = (Button) findViewById(R.id.button_e_high);
        fButtonHigh = (Button) findViewById(R.id.button_f_high);
        fsButtonHigh = (Button) findViewById(R.id.button_f_sharp_high);
        gButtonHigh = (Button) findViewById(R.id.button_g_high);
        gsButtonHigh = (Button) findViewById(R.id.button_g_sharp_high);

        arrayScale = (Button) findViewById(R.id.button_array_scale);

        numPicker= (NumberPicker) findViewById(R.id.randomNumber);
        numPicker.setMinValue(1);
        numPicker.setMaxValue(100);

        eScale = (Button) findViewById(R.id.button_e_scale);

        twinkleStar = (Button) findViewById(R.id.button_twinkle_star);
        alwaysWithMe = (Button) findViewById(R.id.button_always_with_me);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        eScale.setOnClickListener(this);

        twinkleStar.setOnClickListener(this);
        alwaysWithMe.setOnClickListener(this);

        aButtonHigh.setOnClickListener(this);
        asButtonHigh.setOnClickListener(this);
        bButtonHigh.setOnClickListener(this);
        cButtonHigh.setOnClickListener(this);
        csButtonHigh.setOnClickListener(this);
        dButtonHigh.setOnClickListener(this);
        dsButtonHigh.setOnClickListener(this);
        eButtonHigh.setOnClickListener(this);
        fButtonHigh.setOnClickListener(this);
        fsButtonHigh.setOnClickListener(this);
        gButtonHigh.setOnClickListener(this);
        gsButtonHigh.setOnClickListener(this);
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);

        aNoteHigh = MediaPlayer.create(this, R.raw.scalehigha);
        asNoteHigh = MediaPlayer.create(this, R.raw.scalehighbb);
        bNoteHigh = MediaPlayer.create(this, R.raw.scalehighb);
        cNoteHigh = MediaPlayer.create(this, R.raw.scalehighc);
        csNoteHigh = MediaPlayer.create(this, R.raw.scalehighcs);
        dNoteHigh = MediaPlayer.create(this, R.raw.scalehighd);
        dsNoteHigh = MediaPlayer.create(this, R.raw.scalehighds);
        eNoteHigh = MediaPlayer.create(this, R.raw.scalehighe);
        fNoteHigh = MediaPlayer.create(this, R.raw.scalehighf);
        fsNoteHigh = MediaPlayer.create(this, R.raw.scalehighfs);
        gNoteHigh = MediaPlayer.create(this, R.raw.scalehighg);
        gsNoteHigh = MediaPlayer.create(this, R.raw.scalehighgs);
    }

    private void delayTime(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
`   //whatever
    @Override
    public void onClick(View view) {
        int times=numPicker.getValue();
        int i=0;
        switch (view.getId()){
            case R.id.button_always_with_me:
                //I
                


            case R.id.button_twinkle_star:
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(500);
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(800);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(500);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(800);
                fsNoteHigh.seekTo(0); //restarts the note to the beginning
                fsNoteHigh.start();
                delayTime(500);
                fsNoteHigh.seekTo(0); //restarts the note to the beginning
                fsNoteHigh.start();
                delayTime(800);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(1000);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(500);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(800);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(500);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(800);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(500);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(800);
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(1000);

                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(500);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(800);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(500);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(800);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(500);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(800);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(800);

                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(500);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(800);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(500);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(800);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(500);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(800);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(1000);

                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(500);
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(800);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(500);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(800);
                fsNoteHigh.seekTo(0); //restarts the note to the beginning
                fsNoteHigh.start();
                delayTime(500);
                fsNoteHigh.seekTo(0); //restarts the note to the beginning
                fsNoteHigh.start();
                delayTime(800);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(1000);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(500);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(800);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(500);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(800);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(500);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(800);
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                break;




            case R.id.button_array_scale:
                MediaPlayer mPlayer[] = new MediaPlayer[24];//make array
                for(i=0; i<mp.length;i++)
                {

                }

            case R.id.button_a:
                for(i=0; i<times; i++) {
                    aNote.seekTo(0); //restarts the note to the beginning
                    aNote.start();
                    Toast.makeText(this, "A clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_a_sharp:
                for(i=0; i<times; i++) {
                    asNote.seekTo(0);
                    asNote.start();
                    Toast.makeText(this, "A sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_b:
                for(i=0; i<times; i++) {
                    bNote.seekTo(0);
                    bNote.start();
                    Toast.makeText(this, "B clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_c:
                for(i=0; i<times; i++) {
                    cNote.seekTo(0);
                    cNote.start();
                    Toast.makeText(this, "C clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_c_sharp:
                for(i=0; i<times; i++) {
                    csNote.seekTo(0);
                    csNote.start();
                    Toast.makeText(this, "C sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_d:
                for(i=0; i<times; i++) {
                    dNote.seekTo(0);
                    dNote.start();
                    Toast.makeText(this, "D clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_d_sharp:
                for(i=0; i<times; i++) {
                    dsNote.seekTo(0);
                    dsNote.start();
                    Toast.makeText(this, "D sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_e:
                for(i=0; i<times; i++) {
                    eNote.seekTo(0);
                    eNote.start();
                    Toast.makeText(this, "E clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_f:
                for(i=0; i<times; i++) {
                    fNote.seekTo(0);
                    fNote.start();
                    Toast.makeText(this, "F sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_f_sharp:
                for(i=0; i<times; i++) {
                    fsNote.seekTo(0);
                    fsNote.start();
                    Toast.makeText(this, "F sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_g:
                for(i=0; i<times; i++) {
                    gNote.seekTo(0);
                    gNote.start();
                    Toast.makeText(this, "G clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_g_sharp:
                for(i=0; i<times; i++) {
                    gsNote.seekTo(0);
                    gsNote.start();
                    Toast.makeText(this, "G sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_e_scale:
                aNote.seekTo(0); //restarts the note to the beginning
                aNote.start();
                delayTime(500);
                asNote.seekTo(0); //restarts the note to the beginning
                asNote.start();
                delayTime(500);
                bNote.seekTo(0); //restarts the note to the beginning
                bNote.start();
                delayTime(500);
                cNote.seekTo(0); //restarts the note to the beginning
                cNote.start();
                delayTime(500);
                csNote.seekTo(0); //restarts the note to the beginning
                csNote.start();
                delayTime(500);
                dNote.seekTo(0); //restarts the note to the beginning
                dNote.start();
                delayTime(500);
                dsNote.seekTo(0); //restarts the note to the beginning
                dsNote.start();
                delayTime(500);
                eNote.seekTo(0); //restarts the note to the beginning
                eNote.start();
                delayTime(500);
                fNote.seekTo(0); //restarts the note to the beginning
                fNote.start();
                delayTime(500);
                fsNote.seekTo(0); //restarts the note to the beginning
                fsNote.start();
                delayTime(500);
                gNote.seekTo(0); //restarts the note to the beginning
                gNote.start();
                delayTime(500);
                gsNote.seekTo(0); //restarts the note to the beginning
                gsNote.start();
                delayTime(500);

                aNoteHigh.seekTo(0); //restarts the note to the beginning
                aNoteHigh.start();
                delayTime(500);
                asNoteHigh.seekTo(0); //restarts the note to the beginning
                asNoteHigh.start();
                delayTime(500);
                bNoteHigh.seekTo(0); //restarts the note to the beginning
                bNoteHigh.start();
                delayTime(500);
                cNoteHigh.seekTo(0); //restarts the note to the beginning
                cNoteHigh.start();
                delayTime(500);
                csNoteHigh.seekTo(0); //restarts the note to the beginning
                csNoteHigh.start();
                delayTime(500);
                dNoteHigh.seekTo(0); //restarts the note to the beginning
                dNoteHigh.start();
                delayTime(500);
                dsNoteHigh.seekTo(0); //restarts the note to the beginning
                dsNoteHigh.start();
                delayTime(500);
                eNoteHigh.seekTo(0); //restarts the note to the beginning
                eNoteHigh.start();
                delayTime(500);
                fNoteHigh.seekTo(0); //restarts the note to the beginning
                fNoteHigh.start();
                delayTime(500);
                fsNoteHigh.seekTo(0); //restarts the note to the beginning
                fsNoteHigh.start();
                delayTime(500);
                gNoteHigh.seekTo(0); //restarts the note to the beginning
                gNoteHigh.start();
                delayTime(500);
                gsNoteHigh.seekTo(0); //restarts the note to the beginning
                gsNoteHigh.start();
                delayTime(500);
                break;

            case R.id.button_a_high:
                for(i=0; i<times; i++) {
                    aNoteHigh.seekTo(0); //restarts the note to the beginning
                    aNoteHigh.start();
                    Toast.makeText(this, "High A clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_a_sharp_high:
                for(i=0; i<times; i++) {
                    asNoteHigh.seekTo(0);
                    asNoteHigh.start();
                    Toast.makeText(this, "High A sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_b_high:
                for(i=0; i<times; i++) {
                    bNoteHigh.seekTo(0);
                    bNoteHigh.start();
                    Toast.makeText(this, "High B clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_c_high:
                for(i=0; i<times; i++) {
                    cNoteHigh.seekTo(0);
                    cNoteHigh.start();
                    Toast.makeText(this, "High C clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_c_sharp_high:
                for(i=0; i<times; i++) {
                    csNoteHigh.seekTo(0);
                    csNoteHigh.start();
                    Toast.makeText(this, "High C sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_d_high:
                for(i=0; i<times; i++) {
                    dNoteHigh.seekTo(0);
                    dNoteHigh.start();
                    Toast.makeText(this, "High D clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_d_sharp_high:
                for(i=0; i<times; i++) {
                    dsNoteHigh.seekTo(0);
                    dsNoteHigh.start();
                    Toast.makeText(this, "High D sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_e_high:
                for(i=0; i<times; i++) {
                    eNoteHigh.seekTo(0);
                    eNoteHigh.start();
                    Toast.makeText(this, "High E clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_f_high:
                for(i=0; i<times; i++) {
                    fNoteHigh.seekTo(0);
                    fNoteHigh.start();
                    Toast.makeText(this, "High F sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_f_sharp_high:
                for(i=0; i<times; i++) {
                    fsNoteHigh.seekTo(0);
                    fsNoteHigh.start();
                    Toast.makeText(this, "High F sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_g_high:
                for(i=0; i<times; i++) {
                    gNoteHigh.seekTo(0);
                    gNoteHigh.start();
                    Toast.makeText(this, "High G clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;
            case R.id.button_g_sharp_high:
                for(i=0; i<times; i++) {
                    gsNoteHigh.seekTo(0);
                    gsNoteHigh.start();
                    Toast.makeText(this, "High G sharp clicked", Toast.LENGTH_SHORT).show();
                    delayTime(1000);
                }
                break;

            default:
        }
    }
}
