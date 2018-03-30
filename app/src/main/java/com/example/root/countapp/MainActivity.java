package com.example.root.countapp;


import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener
{
    private ViewGroup root;
    private Scene sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8,sc9,sc10,sc11;
    private Transition trans;
    private int current;
    private ArrayList<Scene> list;
    private MediaPlayer correct,wrong,claps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=new ArrayList<Scene>();
        root=findViewById(R.id.rootContainer);
        sc1=Scene.getSceneForLayout(root,R.layout.sc1layout,this);
        sc2=Scene.getSceneForLayout(root,R.layout.sc2layout,this);
        sc3=Scene.getSceneForLayout(root,R.layout.sc3layout,this);
        sc4=Scene.getSceneForLayout(root,R.layout.sc4layout,this);
        sc5=Scene.getSceneForLayout(root,R.layout.sc5layout,this);
        sc6=Scene.getSceneForLayout(root,R.layout.sc6layout,this);
        sc7=Scene.getSceneForLayout(root,R.layout.sc7layout,this);
        sc8=Scene.getSceneForLayout(root,R.layout.sc8layout,this);
        sc9=Scene.getSceneForLayout(root,R.layout.sc9layout,this);
        sc10=Scene.getSceneForLayout(root,R.layout.sc10layout,this);
        sc11=Scene.getSceneForLayout(root,R.layout.lsc11ayout,this);

        list.add(sc1);
        list.add(sc2);
        list.add(sc3);
        list.add(sc4);
        list.add(sc5);
        list.add(sc6);
        list.add(sc7);
        list.add(sc8);
        list.add(sc9);
        list.add(sc10);
        list.add(sc11);

        trans=new AutoTransition();
        trans.setDuration(500);
        trans.setInterpolator(new LinearInterpolator());

        setCurrentScene();

        sc1.enter();
        correct=MediaPlayer.create(this,R.raw.correct);
        wrong=MediaPlayer.create(this,R.raw.wrong);
        claps=MediaPlayer.create(this,R.raw.claps);
    }

    @Override
    public void onClick(View view)
    {

        switch (view.getId())
        {
            case R.id.button:
                if(current==1) {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button2:
                if(current==1)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button3:
                if(current==1)
                {  view.setBackgroundColor(Color.GREEN);
                    changeScene(sc2);}
                break;
            case R.id.button4:
                if (current==2)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button5:
                if(current==2)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc3);
                }
                break;
            case R.id.button6:
                if (current==2)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button7:
                if(current==3)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc4);
                }
                break;
            case R.id.button8:
                if (current==3)
                {   view.setBackgroundColor(Color.RED);
                wrong.start();}
                break;
            case R.id.button9:
                if (current==3)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button10:
                if(current==4)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button11:
                if (current==4) {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc5);
                }
                break;
            case R.id.button12:
                if (current==4)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button13:
                if (current==5)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button14:
                if (current==5)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button15:
                if (current==5)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc6);
                }
                break;
            case R.id.button16:
                if (current==6)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button17:
                if (current==6)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc7);
                }
                break;
            case R.id.button18:
                if (current==6)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button19:
                if (current==7)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc8);
                }
                break;
            case  R.id.button20:
                if (current==7)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button21:
                if (current==7)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button22:
                if (current==8)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button23:
                if (current==8)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc9);
                }
                break;
            case R.id.button24:
                if (current==8)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button25:
                if (current==9)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button26:
                if (current==9)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button27:
                if (current==9)
                {
                    view.setBackgroundColor(Color.GREEN);
                    changeScene(sc10);
                }
                break;
            case R.id.button28:
                if (current==10)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.button29:
                if (current==10)
                {
                    view.setBackgroundColor(Color.GREEN);
                    TransitionManager.go(sc11, trans);
                    claps.start();
                }
                break;
            case R.id.button30:
                if (current==10)
                {
                    view.setBackgroundColor(Color.RED);
                    wrong.start();
                }
                break;
            case R.id.imageView12:
                backToPrevScene();
                break;
            case R.id.imageView13:
                backToPrevScene();
                break;
            case R.id.imageView14:
                backToPrevScene();
                break;
            case R.id.imageView15:
                backToPrevScene();
                break;
            case R.id.imageView16:
                backToPrevScene();
                break;
            case R.id.imageView17:
                backToPrevScene();
                break;
            case R.id.imageView18:
                backToPrevScene();
                break;
            case R.id.imageView19:
                backToPrevScene();
                break;
            case R.id.imageView20:
                backToPrevScene();
                break;
            case R.id.imageView21:
                TransitionManager.go(sc1, trans);
                break;
            default:backToScene();

        }
    }

    private void setCurrentScene()
    {
        sc1.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=1;
            }
        });
        sc2.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=2;
            }
        });
        sc3.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=3;
            }
        });
        sc4.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=4;
            }
        });
        sc5.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=5;
            }
        });
        sc6.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=6;
            }
        });
        sc7.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=7;
            }
        });
        sc8.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=8;
            }
        });
        sc9.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=9;
            }
        });
        sc10.setEnterAction(new Runnable() {
            @Override
            public void run() {
                current=10;
            }
        });
    }

   private void changeScene(final Scene sc)
    {
        correct.start();
        correct.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                TransitionManager.go(sc,trans);
            }
        });
    }

   private void backToScene()
    {
        int index=current-1;
        TransitionManager.go(list.get(index),trans);
    }
    private void backToPrevScene()
    {
        int index=current-2;
        TransitionManager.go(list.get(index),trans);
    }
}
