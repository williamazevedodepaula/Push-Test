Push-Test
=========

Web Service para teste de envio de notificações Push para aparelhos Android, através da GCM. Contém dois métodos básicos:
<p><h3><b>register</b></h3><br>
Registra o device de destino. Recebe como parâmetro o id do serviço na GCM e o id fornecido ao aparelho durante o registro na GCM.
<p>
<b>Exemplo:</b><br>
http://192.168.0.103:8080/teste_push/tests/push_test/register/AIzaSyD40AXOMAXmWZQVVKhCJ0_UOv5devZbs5A/APA91bFmwYot3yuy6HFqbSBj-vfZ1G1u-u155KRyPThy6bXmYilh1yBJkIhfML_sCOYIsEbuE0i8Y8KqC3cCt4WEi5T1j_7bxn5ljJOIGsE86w4w0SUZjVVcXoRMC2T86iy_x17ZYZVWBJg5cDusJs8qTmr1dxp_Qg/

<p><h3><b>send</b></h3><br>
Envia uma notificação para o aparelho previamente registrado. Recebe como parâmetro apenas a mensagem a ser enviada.
Ocorrerá uma excessão caso <b>Register</b> não tenha sido chamado antes de <b>send</b>.
<p>
<b>Exemplo:</b><br>
http://192.168.0.103:8080/teste_push/tests/push_test/send/teste%20de%20notifica%C3%A7%C3%B5es%20push/
