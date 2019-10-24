import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class M0117140 extends PApplet {

// Processing課題2
// (1) 最初に次の操作を行い、元のK2_FreeWorkフォルダーを残したままコピーを用意する。
//    (1.1) ファイル→名前を付けて保存...を実行
//    (1.2) 現れたウィンドウ（ファイルダイアログ）の「ファイル名」を自分の学籍番号（M01xxxxx）して「保存」
// (2)その後、M01xxxxxの中身を変更することで課題を完成させる。
// (3)完成したら、次の手順で提出
//    (3.1) ファイル→保存 を実行
//    (3.2) 発表資料・プログラム説明書（Kadai_2.pptx）を完成させ、フォルダーM01xxxxxの中に入れる
//    (3.3) そのフォルダーM01xxxxxをSAに提出（USBメモリにコピー。16:30までに）
//    (3.4) そのフォルダーをzip圧縮し、ファイルM01xxxxx.zipをMoodleで提出（16:35までに）
//　　　　zip圧縮は、フォルダーのアイコンを右クリックし、「送る」→「圧縮(zip形式)フォルダー」を実行する方法で行ってください。
//
// MOSHI JOUKI NO NIHONGO GA YOMENAI BAAI HA "File" MENYU KARA "Preferences" WO JIKKOU SHI, 
// "Editor and Console font" NO SHITEI WO "MS GOSHIKKU" (KATAKANA) NI SHITE "Ok" BOTAN WO OSU 
//
float cornerX = 0;
float cornerY = 0;
int pose = 0;
int henshin = 0;
public void setup() {
  
  setupMisc();
}
public void draw() {
  background(156, 167, 226);
  noFill();
  stroke(0);
  strokeWeight(1);


  drawKadai2();//■この行は変更しない

  //■この行は必ず自分の作品タイトルと学籍番号・氏名を記入
  drawTitleAndName("ウルトラマン", "M0117140 朱文イク");
}
////////■以降、自由に追加・変更してください。BBBBBなどの奇妙な名前は適切に改善してください。
////////■自動的、またはインタラクションにより動く作品を作ること
public void drawKadai2() {//■この行は変更しない
  BG();
  Ultraman();
  Betacapsule();
}

public void BG() {
  fill(255, 239, 133);
  ellipse(0, 0, 200, 200);

  fill(140, 140, 140);
  rect(0, 300, 200, 300);
  rect(300, 300, 200, 300);
  rect(600, 300, 200, 300);
  rect(900, 300, 200, 300);
}
int colortimer;

public void Ultraman() {
  if (pose == 0) {
    fill(255);
    ellipse(500, 150, 180, 200);
    fill(255);
    rect(495, 25, 10, 150);
    fill(255, 255, 0);
    ellipse(450, 150, 70, 50);
    ellipse(550, 150, 70, 50);
    fill(0);
    ellipse(475, 160, 10, 10);
    ellipse(525, 160, 10, 10);
    fill(255);
    rect(390, 125, 20, 50);
    rect(590, 125, 20, 50);
    rect(470, 200, 60, 42);
    line(470, 214, 530, 214);
    line(470, 228, 530, 228);
    rect(400, 250, 200, 60);
    arc(400, 350, 200, 200, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 200, 200, -HALF_PI, 0);
    noFill();
    arc(400, 350, 50, 80, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 50, 80, -HALF_PI, 0);
    fill(255);
    rect(425, 310, 150, 150);
    ellipse(335, 385, 100, 100);
    ellipse(665, 385, 100, 100);
    rect(425, 310, 150, 150);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(400, 500, 75, 200);
    rect(525, 500, 75, 200);
    line(600, 500, 600, 600);
    line(475, 500, 475, 600);
    line(525, 500, 525, 600);
    line(475, 500, 525, 500);

    fill(255, 0, 0);

    triangle(480, 345, 520, 345, 500, 400);
    rect(400, 550, 75, 20);
    triangle(430, 550, 445, 550, 437.5f, 530);
    triangle(555, 550, 570, 550, 562.5f, 530);
    rect(525, 550, 75, 20);
    rect(475, 250, 50, 25);
    triangle(475, 275, 525, 275, 500, 325);
    rect(400, 250, 50, 25);
    rect(550, 250, 50, 25);
    triangle(400, 275, 400, 310, 335, 275);
    triangle(600, 275, 600, 310, 665, 275);
    rect(435, 275, 25, 70);
    rect(540, 275, 25, 70);
    rect(450, 345, 100, 30);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(425, 425, 150, 50); 
    rect(425, 460, 150, 50);
    fill(140, 140, 140);
    arc(400, 350, 50, 80, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 50, 80, -HALF_PI, 0);

    fill(0, 150, 255);
    ellipse(500, 325, 40, 40);
  }

  if (pose == 1) {
    fill(255);
    ellipse(500, 150, 180, 200);
    fill(255);
    rect(495, 25, 10, 150);
    fill(255, 255, 0);
    ellipse(450, 150, 70, 50);
    ellipse(550, 150, 70, 50);
    fill(0);
    ellipse(475, 160, 10, 10);
    ellipse(525, 160, 10, 10);
    fill(255);
    rect(390, 125, 20, 50);
    rect(590, 125, 20, 50);
    rect(470, 200, 60, 42);
    line(470, 214, 530, 214);
    line(470, 228, 530, 228);
    rect(400, 250, 200, 60);


    fill(255);
    rect(425, 310, 150, 150);

    rect(425, 310, 150, 150);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(400, 500, 75, 200);
    rect(525, 500, 75, 200);
    line(600, 500, 600, 600);
    line(475, 500, 475, 600);
    line(525, 500, 525, 600);
    line(475, 500, 525, 500);

    fill(255, 0, 0);
    triangle(480, 345, 520, 345, 500, 400);
    rect(400, 550, 75, 20);
    triangle(430, 550, 445, 550, 437.5f, 530);
    triangle(555, 550, 570, 550, 562.5f, 530);
    rect(525, 550, 75, 20);
    rect(475, 250, 50, 25);
    triangle(475, 275, 525, 275, 500, 325);
    rect(400, 250, 50, 25);
    rect(550, 250, 50, 25);

    rect(435, 275, 25, 70);
    rect(540, 275, 25, 70);
    rect(450, 345, 100, 30);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(425, 425, 150, 50); 
    rect(425, 460, 150, 50);

    fill(255);
    rect(400, 240, 50, 150);
    triangle(430, 240, 410, 210, 450, 240);
    triangle(400, 180, 400, 240, 430, 240);

    fill(0, 150, 255);
    ellipse(500, 325, 40, 40);

    fill(255);
    rect(400, 280, 210, 50);
    triangle(340, 280, 400, 280, 400, 330);
    fill(255, 0, 0);
    triangle(450, 280, 610, 280, 610, 330);
  }
  if (pose == 2) {
    fill(255);
    ellipse(500, 150, 180, 200);
    fill(255);
    rect(495, 25, 10, 150);
    fill(255, 255, 0);
    ellipse(450, 150, 70, 50);
    ellipse(550, 150, 70, 50);
    fill(0);
    ellipse(475, 160, 10, 10);
    ellipse(525, 160, 10, 10);
    fill(255);
    rect(390, 125, 20, 50);
    rect(590, 125, 20, 50);
    rect(470, 200, 60, 42);
    line(470, 214, 530, 214);
    line(470, 228, 530, 228);
    rect(400, 250, 200, 60);
    arc(400, 350, 200, 200, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 200, 200, -HALF_PI, 0);
    noFill();
    arc(400, 350, 50, 80, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 50, 80, -HALF_PI, 0);
    fill(255);
    rect(425, 310, 150, 150);
    ellipse(335, 385, 100, 100);
    ellipse(665, 385, 100, 100);
    rect(425, 310, 150, 150);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(400, 500, 75, 200);
    rect(525, 500, 75, 200);
    line(600, 500, 600, 600);
    line(475, 500, 475, 600);
    line(525, 500, 525, 600);
    line(475, 500, 525, 500);

    fill(255, 0, 0);

    triangle(480, 345, 520, 345, 500, 400);
    rect(400, 550, 75, 20);
    triangle(430, 550, 445, 550, 437.5f, 530);
    triangle(555, 550, 570, 550, 562.5f, 530);
    rect(525, 550, 75, 20);
    rect(475, 250, 50, 25);
    triangle(475, 275, 525, 275, 500, 325);
    rect(400, 250, 50, 25);
    rect(550, 250, 50, 25);
    triangle(400, 275, 400, 310, 335, 275);
    triangle(600, 275, 600, 310, 665, 275);
    rect(435, 275, 25, 70);
    rect(540, 275, 25, 70);
    rect(450, 345, 100, 30);
    arc(425, 510, 50, 100, HALF_PI * 2, HALF_PI + PI);
    arc(575, 510, 50, 100, -HALF_PI, 0);
    rect(425, 425, 150, 50); 
    rect(425, 460, 150, 50);
    fill(140, 140, 140);
    arc(400, 350, 50, 80, HALF_PI * 2, HALF_PI + PI);
    arc(600, 350, 50, 80, -HALF_PI, 0);
  }
  if (pose == 2) {
    if (colortimer < 10) {
      fill(241, 112, 89);
      ellipse(500, 325, 40, 40);
    } else if (colortimer < 25) {
      fill(204, 0, 0);
      ellipse(500, 325, 40, 40);
    } else if (colortimer < 30) {
      fill(155, 155, 155);
      ellipse(500, 325, 40, 40);
    }
    if ( colortimer != 30) {
      colortimer++;
    } else {
      colortimer = 0;
    }
  }



  if (pose == 3) {
    background(204, 0, 0);
    fill(255);
    arc(525,410, 30, 40, 0, PI);
    arc(525, 380, 90, 60, 0, PI);
    ellipse(450, 350, 100, 100);
    ellipse(525, 375, 50, 50);
    ellipse(570, 400, 45, 45);
    rect(522.5f, 345, 5, 40); 
    rect(518, 388, 14, 10);
    
    fill(255, 255, 0);
    ellipse(510, 375, 13, 10);
    ellipse(540, 375, 13, 10);
    
    fill(0);
    ellipse(514,377, 2, 2);
    ellipse(536,377, 2, 2);
    
    fill(255, 40, 25);
    arc(525,405, 45, 20, 0, PI);
    
    
  }
  if (pose == 3) {
    if (henshin < 50) {
      henshin++;
    }
    if (henshin == 50) {
      background(204, 0, 0);

      fill(255);
      arc(625, 440, 100, 90, PI, PI + PI);
      arc(420, 425, 200, 120, HALF_PI, PI); 
      arc(500, 425, 200, 200, 0, PI);
      arc(500, 500, 100, 120, 0, PI);
      ellipse(675, 440, 100, 100);

      fill(255, 40, 25);
      rect(425, 425, 30, 60);
      rect(485, 425, 30, 90);
      rect(545, 425, 30, 60);
      arc(500, 485, 150, 85, 0, PI);

      fill(255);
      ellipse(500, 350, 180, 200);
      rect(495, 225, 10, 150);
      fill(255, 255, 0);
      ellipse(450, 350, 70, 50);
      ellipse(550, 350, 70, 50);
      fill(0);
      ellipse(475, 360, 10, 10);
      ellipse(525, 360, 10, 10);
      fill(255);
      rect(390, 325, 20, 50);
      rect(590, 325, 20, 50);
      rect(470, 400, 60, 42);
      line(470, 414, 530, 414);
      line(470, 428, 530, 428);
      ellipse(250, 350, 300, 300);
    }
  }
}
public void Betacapsule() {
  fill(250, 250, 250); 
  rect(cornerX, cornerY, 26, 30);
  fill(130, 201, 169);
  rect(cornerX, cornerY + 30, 26, 60);
  fill(47, 79, 75);
  triangle(cornerX, cornerY + 30, cornerX + 26, cornerY + 30, cornerX + 13, cornerY + 90);
  fill(255, 40, 25);
  ellipse(cornerX + 13, cornerY + 45, 10, 10);
}

public void mousePressed() {
}

public void mouseReleased() {
}

public void mouseDragged() {
}

public void mouseMoved() {
  cornerX = mouseX;
  cornerY = mouseY;
}

public void keyPressed() {
  if (key == 'z') {
    if (pose != 1) {
      pose = 1;
    } else if (pose == 1) {
      pose = 0;
    }
  }
  if (key == 'x') {
    if (pose != 2) {
      pose = 2;
    } else if (pose == 2) {
      pose = 0;
    }
  }
}

public void keyReleased() {
  if (key == 'c') {
    if (pose != 3) {
      pose = 3;
    } else if (pose == 3) {
      pose = 0;
      henshin = 0;
    }
  }
}
//ここの内容は決して変更しないこと
//実行時のエラーで、このプログラムのどこかの行がエラー箇所として指摘される場合があります
//そのような場合でも、本当のエラー原因は、エラー箇所を呼び出している【あなたが】書いたプログラムです
//
//ここの内容は理解できなくても課題提出には影響ありませんが、
//何をやっているかを読んでみることは勉強になるはずです。

PFont titleFont;
public void setupMisc() {//もろもろの初期設定
  smooth();
  titleFont = createFont("HGPｺﾞｼｯｸM", 40);
}
public void drawRuler(int xMax, int yMax) {//目盛を描画する。左上（0, 0)、右下(xMax, yMax)の範囲
  drawLattice(xMax, yMax, 10, 240);//とても薄いグレーで10画素間隔格子を描画
  drawLattice(xMax, yMax, 50, 210);//やや薄いグレーで50画素間隔格子を描画
  drawLattice(xMax, yMax, 100, 160);//比較的濃いグレーで100画素間隔格子を描画
}
//縦横の格子状に線分を描く
//(0, 0)と(xMax, yMax)の間の範囲に間隔interval画素でstrokeColorの色の縦横線を描く
public void drawLattice(int xMax, int yMax, int interval, int strokeColor) {
  //以下の設定stroke, strokeWeightは、ここが実行されたあとdrawLattice終了後も持続します
  //あなたの書いた部分の実行にも影響します
  //自分で書く部分の描画直前の行で自分の望むstroke, strokeWeightの設定をし直してください
  stroke(strokeColor);
  strokeWeight(1);
  for (int x = 0; x < xMax; x += interval) {
    line(x, 0, x, yMax - 1);
  }
  for (int y = 0; y < yMax; y += interval) {
    line(0, y, xMax - 1, y);
  }
}
public void drawTitleAndName(String title, String name) {
  textFont(titleFont);
  textSize(40);
  fill(255);
  final int areaHeight = 100;
  rect(0, height - areaHeight, width, areaHeight);
  fill(0);
  drawTitle(title, areaHeight);
  drawName(name);
}
public void drawTitle(String title, int areaHeight) {
  textAlign(LEFT, TOP);
  final int y1 = height - areaHeight + 10;
  final int y2 = height - areaHeight / 2;
  final int x = 1;
  if (title.length() <= 25) {
    text(title, x, y1);
  } else if (title.length() <= 40) {
    text(title.substring(0, 25), x, y1);
    text(title.substring(25), x, y2);
  } else {
    text(title.substring(0, 25), x, y1);
    text(title.substring(25, 40), x, y2);
  }
}
public void drawName(String name) {
  textAlign(RIGHT, BOTTOM);
  text(name, width - 1, height - 1);
}
  public void settings() {  size(1000, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "M0117140" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
