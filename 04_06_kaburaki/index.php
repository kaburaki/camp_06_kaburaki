
<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <title>データ登録</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <style>div{padding: 10px;font-size:16px;}</style>
  <link rel="stylesheet" href="select.css"><!-- 追加で読み込ませる -->

</head>
<body>



<!-- Head[Start] -->
<header>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
    <div class="navbar-header"><a class="navbar-brand" href="select.php">献立セレクショントップへ</a></div>
    </div>
  </nav>
</header>
<!-- Head[End] -->

<!-- Main[Start] -->
<!-- ここでinsert.phpにデータを送っている -->

<form method="post" action="insert.php">
  <div class="jumbotron">
   <fieldset>
    <legend>入力フォーム</legend>
    <!-- name="xxx" の部分に注目するようにしておいてください🤗 -->
    <!-- フォームに対応してデータベースも追加 -->
     <label>名前：<input type="text" name="name"></label><br>
     <label>献立名：<input type="text" name="menuname"></label><br>
     <label>写真：<input type="file" name="picture"></label><br>
     <label>材料：<textArea name="zairyo" rows="5" cols="40"></textArea></label><br>
     <label>作り方：<textArea name="howto" rows="5" cols="40"></textArea></label><br>
     <input type="submit" value="送信">
    </fieldset>
  </div>
</form>
<!-- Main[End] -->


</body>
</html>