### Codice di esempio

Aggiungere il riferimento al repository al **`pom.xml`** del progetto

```xml
  <repositories>
    <repository>
      <id>liverif</id>
      <url>https://www.liverif.it/maven</url>
      <snapshots>
        <enabled>true</enabled>
      </snapshots>
      <releases>
        <enabled>true</enabled>
      </releases>
    </repository>
  </repositories>
```

Importare la libreria 

```xml
  <dependencies>
    <dependency>
      <groupId>liverif.project</groupId>
      <artifactId>liverif-core</artifactId>
      <version>1.3</version>
    </dependency>
  </dependencies>
```

Vedi il codice di esempio di questo progetto.