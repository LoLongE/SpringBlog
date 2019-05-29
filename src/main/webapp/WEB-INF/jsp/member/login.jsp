<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" type="button" data-toggle="collapse" date-target="#navbar-main">
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Login</a>
		</div>
	</div>
	</div>

	<div class="container">
		<div class="col-lg-4"></div>
			<div class="col-lg-4">
			
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디" id="member_id" name="member_id" maxlength="20">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="비밀번호" id="member_password" name="member_password" maxlength="20">

					</div>
					<input type="submit" class="btn btn-primary form-control" id="btn_login" name="btn_login" value="Login">
			</div>
			</div>
		<div class="col-lg-4"></div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<script>
		$("#btn_login").on("click", function(){
			var member_id = $("#member_id").val();
			var member_password = $("#member_password").val();
			$.ajax({
				url : "/selectLoginView.do",
				data : { member_id : member_id, member_password : member_password },
				dataType : "html",
				error : function(data){					
					alert("로그인이 실패하였습니다.");
				},
				success : function(data){
					console.log(data);
					alert("로그인이 성공하였습니다.");
				}
			});
		});
	</script>
</body>
</html>