# 📱 Contador App

Aplicativo Android simples desenvolvido em **Kotlin** como projeto de prática durante a graduação em **Análise e Desenvolvimento de Sistemas (ADS)**.

O app permite incrementar, decrementar e resetar um contador, incluindo ações rápidas ao segurar os botões.

---

## 🚀 Funcionalidades

- ➕ Incrementar contador (+1)
- ➖ Decrementar contador (-1)
- 🔁 Resetar contador
- ⏫ Incremento rápido (+10 ao segurar)
- ⏬ Decremento rápido (-10 ao segurar)
- 🚫 Botão de diminuir desabilitado automaticamente quando o valor é 0

---

## 🛠️ Tecnologias Utilizadas

- Kotlin
- Android SDK
- ConstraintLayout
- AppCompatActivity
- Gradle (Kotlin DSL)

---

## 🧠 Conceitos Aplicados

- Manipulação de eventos (`setOnClickListener`)
- `setOnLongClickListener`
- Atualização dinâmica da UI
- Controle de estado com variável (`contador`)
- Função dedicada para atualização da interface (`atualizarUI()`)
- Separação de testes unitários e instrumentados

---

## 📂 Estrutura do Projeto

```
app/
├── manifests/
│   └── AndroidManifest.xml
│
├── kotlin+java/
│   ├── com.example.contador/
│   │   └── MainActivity.kt
│   │
│   ├── com.example.contador (androidTest)/
│   │   └── ExampleInstrumentedTest.kt
│   │
│   └── com.example.contador (test)/
│       └── ExampleUnitTest.kt
│
├── res/
│   ├── drawable/
│   ├── layout/
│   │   └── activity_main.xml
│   ├── mipmap/
│   ├── values/
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   └── themes/
│   └── xml/
│
└── Gradle Scripts/
```

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

- Praticar desenvolvimento Android com Kotlin
- Trabalhar com manipulação de estado
- Entender eventos de clique e clique longo
- Estruturar um projeto simples de forma organizada
- Manter um projeto bem documentado para portfólio

---

## 👨‍💻 Autor

**Bruno Eugênio**  
🎓 Estudante de Análise e Desenvolvimento de Sistemas  
💻 Foco em Desenvolvimento Backend  
🚀 Em constante evolução

---

## 📌 Observação

Projeto desenvolvido para fins acadêmicos e prática de desenvolvimento Android.
