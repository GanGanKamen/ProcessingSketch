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
void setup() {
  size(1000, 700);
  setupMisc();
}
void draw() {
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
void drawKadai2() {//■この行は変更しない
  BG();
  Ultraman();
  Betacapsule();
}

void BG() {
  fill(255, 239, 133);
  ellipse(0, 0, 200, 200);

  fill(140, 140, 140);
  rect(0, 300, 200, 300);
  rect(300, 300, 200, 300);
  rect(600, 300, 200, 300);
  rect(900, 300, 200, 300);
}
int colortimer;

void Ultraman() {
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
    triangle(430, 550, 445, 550, 437.5, 530);
    triangle(555, 550, 570, 550, 562.5, 530);
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
    triangle(430, 550, 445, 550, 437.5, 530);
    triangle(555, 550, 570, 550, 562.5, 530);
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
    triangle(430, 550, 445, 550, 437.5, 530);
    triangle(555, 550, 570, 550, 562.5, 530);
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
    rect(522.5, 345, 5, 40); 
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
void Betacapsule() {
  fill(250, 250, 250); 
  rect(cornerX, cornerY, 26, 30);
  fill(130, 201, 169);
  rect(cornerX, cornerY + 30, 26, 60);
  fill(47, 79, 75);
  triangle(cornerX, cornerY + 30, cornerX + 26, cornerY + 30, cornerX + 13, cornerY + 90);
  fill(255, 40, 25);
  ellipse(cornerX + 13, cornerY + 45, 10, 10);
}

void mousePressed() {
}

void mouseReleased() {
}

void mouseDragged() {
}

void mouseMoved() {
  cornerX = mouseX;
  cornerY = mouseY;
}

void keyPressed() {
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

void keyReleased() {
  if (key == 'c') {
    if (pose != 3) {
      pose = 3;
    } else if (pose == 3) {
      pose = 0;
      henshin = 0;
    }
  }
}
