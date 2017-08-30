package com.emojitest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_show)
    TextView tvShow;
    @Bind(R.id.et_input)
    EditText etInput;
    @Bind(R.id.iv_emoji_0)
    ImageView ivEmoji0;
    @Bind(R.id.iv_emoji_1)
    ImageView ivEmoji1;
    @Bind(R.id.iv_emoji_2)
    ImageView ivEmoji2;
    @Bind(R.id.iv_emoji_3)
    ImageView ivEmoji3;
    @Bind(R.id.iv_emoji_4)
    ImageView ivEmoji4;
    @Bind(R.id.iv_emoji_5)
    ImageView ivEmoji5;
    @Bind(R.id.iv_emoji_6)
    ImageView ivEmoji6;
    @Bind(R.id.iv_emoji_7)
    ImageView ivEmoji7;
    @Bind(R.id.iv_emoji_8)
    ImageView ivEmoji8;
    @Bind(R.id.iv_emoji_9)
    ImageView ivEmoji9;
    @Bind(R.id.iv_emoji_10)
    ImageView ivEmoji10;
    @Bind(R.id.btn_send)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_emoji_0, R.id.iv_emoji_1, R.id.iv_emoji_2, R.id.iv_emoji_3, R.id.iv_emoji_4, R.id.iv_emoji_5, R.id.iv_emoji_6, R.id.iv_emoji_7, R.id.iv_emoji_8, R.id.iv_emoji_9, R.id.iv_emoji_10, R.id.btn_send})
    public void onViewClicked(View view) {

        Bitmap bitmap = null;
        switch (view.getId()) {
            case R.id.iv_emoji_0:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_0);
                break;
            case R.id.iv_emoji_1:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_1);
                break;
            case R.id.iv_emoji_2:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_2);
                break;
            case R.id.iv_emoji_3:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_3);
                break;
            case R.id.iv_emoji_4:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_4);
                break;
            case R.id.iv_emoji_5:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_5);
                break;
            case R.id.iv_emoji_6:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_6);
                break;
            case R.id.iv_emoji_7:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_7);
                break;
            case R.id.iv_emoji_8:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_8);
                break;
            case R.id.iv_emoji_9:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_9);
                break;
            case R.id.iv_emoji_10:
                bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.emoji_10);
                break;
            case R.id.btn_send:
                tvShow.setText(etInput.getText());
                etInput.setText("");
                return;
        }
        ImageSpan imageSpan = new ImageSpan(MainActivity.this, bitmap);
        SpannableString spannableString=new SpannableString("emoji_");
        spannableString.setSpan(imageSpan, 0, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        etInput.append(spannableString);
    }
}
