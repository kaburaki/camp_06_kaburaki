<?php
session_start();

// ログイン状態チェック
if (!isset($_SESSION["NAME"])) {
    header("Location: Logout.php");
    exit;
}
?>


<?php
//1.  DB接続します xxxにDB名を入れます
try {
$pdo = new PDO('mysql:dbname=04_06_kaburaki;charset=utf8;host=localhost','root','');
} catch (PDOException $e) {
  exit('データベースに接続できませんでした。'.$e->getMessage());
}

//２．データ登録SQL作成
//作ったテーブル名を書く場所  xxxにテーブル名を入れます
$stmt = $pdo->prepare("SELECT * FROM foodmenu ");
$status = $stmt->execute();

//３．データ表示
$view="";
if($status==false){
  //execute（SQL実行時にエラーがある場合）
  $error = $stmt->errorInfo();
  exit("ErrorQuery:".$error[2]);
}else{
  //Selectデータの数だけ自動でループしてくれる $resultの中に「カラム名」が入ってくるのでそれを表示させる例
  while( $result = $stmt->fetch(PDO::FETCH_ASSOC)){
    $view .= '<div class="test">';
    $view .= "名前：".$result["name"]."<br>";
    $view .= "献立名：".$result["menuname"]."<br>";
    $view .= "完成イメージ：".$result["picture"]."<br>";
    $view .= "材料：".$result["zairyo"]."<br>";
    $view .= "作り方：".$result["howto"];
    $view .= "</div>";

  }
}
?>


<!DOCTYPE html>
<html lang="ja">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="slick-theme.css" type="text/css">
<link rel="stylesheet" href="slick.css" type="text/css">
<link rel="stylesheet" href="select.css" type="text/css">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script src="slick.js" type="text/javascript"></script>
<script src="select.js" type="text/javascript"></script>
<title>献立セレクション</title>

</head>
<body id="main">
<!-- Head[Start] -->

<header class="header">
    <h1 class="logo">献立セレクショントップ画面</h1>
    <div class="menu">
      <p>ようこそ<u><?php echo htmlspecialchars($_SESSION["NAME"], ENT_QUOTES); ?></u>さん</p>  <!-- ユーザー名をechoで表示 -->
      <li><a href="index.php">献立登録</a></li>
      <li><a href="Logout.php">ログアウト</a></li>

      <link rel="stylesheet" href="slick-theme.css" type="text/css">
      <link rel="stylesheet" href="slick.css" type="text/css">

    </div>
</header>

<div class="container">
      <div class="single-item">
        <div>
          <img src="picture/picture1.jpeg" alt="" class="picture">
        </div>
        <div>
          <img src="picture/picture2.jpeg" alt="" class="picture"> 
        </div>
        <div>
          <img src="picture/picture3.jpeg" alt="" class="picture"> 
        </div>
        <div>
          <img src="picture/picture4.jpeg" alt="" class="picture"> 
        </div>
        <div>
          <img src="picture/picture5.jpeg" alt="" class="picture"> 
        </div>
        <div>
          <img src="picture/picture6.jpeg" alt="" class="picture"> 
        </div>
      </div>
</div>

<!-- Main[Start] $view-->
<div id="ex">
          <!-- [$view] この箇所にphpを埋め込んでいる -->
    <div class="container-jumbotron"><?=$view?></div>
</div>

<!-- Main[End] -->

<!--Facebookボタン--> 
<a href="//www.facebook.com" title="Facebookでシェア" onclick="return sns_window(this, 800, 600);">
  Facebook
</a>

<!-- Twitter -->
<a href="//twitter.com" title="Twitterでシェア" onclick="return sns_window(this, 400, 600);">
  Twitter
</a>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="select.js"></script>
<script src="slick.js" type="text/javascript"></script>
    

</body>

</html>
