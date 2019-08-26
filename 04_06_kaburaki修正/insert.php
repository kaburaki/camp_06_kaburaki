<?php
//1. POSTデータ取得

//まず前のphpからデーターを受け取る（この受け取ったデータをもとにbindValueと結びつけるため）
$name = $_POST["name"];
$menuname = $_POST["menuname"];
$picture = $_POST["picture"];
$zairyo = $_POST["zairyo"];
$howto = $_POST["howto"];

// echo $name;
// echo $menuname;
// echo $picture;
// echo $zairyo;
// echo $howto;

//2. DB接続します xxxにDB名を入力する
//ここから作成したDBに接続をしてデータを登録します xxxxに作成したデータベース名を書きます
try {
  $pdo = new PDO('mysql:dbname=04_06_kaburaki;charset=utf8;host=localhost','root','');
} catch (PDOException $e) {
  exit('DbConnectError:'.$e->getMessage());
}


//３．データ登録SQL作成 //ここにカラム名を入力する
//xxx_table(テーブル名)はテーブル名を入力します
$stmt = $pdo->prepare("INSERT INTO foodmenu(id, name, menuname, picture, zairyo, howto, indate)VALUES(NULL, :name, :menuname, :picture, :zairyo, :howto, sysdate())");
$stmt->bindValue(':name', $name, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
$stmt->bindValue(':menuname', $menuname, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
$stmt->bindValue(':picture', $picture, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
$stmt->bindValue(':zairyo', $zairyo, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)$status = $stmt->execute();
$stmt->bindValue(':howto', $howto, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)$status = $stmt->execute();
$status = $stmt->execute();

//４．データ登録処理後
if($status==false){
  //SQL実行時にエラーがある場合（エラーオブジェクト取得して表示）
  $error = $stmt->errorInfo();
  exit("QueryError:".$error[2]);
}else{
  //５．index.phpへリダイレクト 書くときにLocation: in この:　のあとは半角スペースがいるので注意！！
  header("Location: select.php");
  exit;

}
?>
