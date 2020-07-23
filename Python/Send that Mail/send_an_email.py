import smtplib

sender_email = "sender@email.com"
sender_password = "my_password"

def send_email(receiver_email, subject, body):
    message = "Subject: " + str(subject) + "\n\n" + str(body)
    #message = "Subject: {}\n\n{}".format(subject, body)
    with smtplib.SMTP_SSL("smtp.gmail.com", 465) as server:
        server.login(sender_email, sender_password)
        server.sendmail(sender_email, receiver_email, message)
