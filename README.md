# Funktionen des Web-Services
Mit diesem Web-Service kann man sich eine Begrüßung ausgeben lassen, welche wie folgt, aussieht: **Hallo "Name"**

# Wie startet man den Service
Um den Service zu starten, muss man die Java Version 8 auswählen, da es mit den anderen meines Wissens nach nicht 
funktioniert. Nun kann man ganz einfach die Main Klasse ausführen oder den Befehl `mvn sprint-boot:run`
benutzen. Somit wird der Server auf dem localhost gestartet und ist unter http://localhost:8080/ws erreichbar.

# Anfrage auf den Server
Um eine Anfrage auf den Server zu schicken, erstellt man zunächst eine Datei mit der Endung .xml; Optional kann man
folgenden Code auch direkt in Curl schreiben, so ist es jedoch sauberer. In die Datei geben wir den Code
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <GreetMeRequest xmlns="http://localhost/services/">
            <name>Your Name</name>
        </GreetMeRequest>
    </soap:Body>
</soap:Envelope>
```
Dies bildet das Paket der Anfrage und schickt als Namen "Your Name" mit.

Jetzt öffnen wir eine Konsole und geben den Befehl
```
curl -X POST -H "Content-Type: text/xml" -d @<Name der Datei>.xml http://localhost:8080/ws
```
ein, womit eine curl-Anfrage auf den Service geschickt wird.