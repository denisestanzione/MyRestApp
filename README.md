# 💻MyRestApp - Applicazione Android 
Un'applicazione Android che, dopo autenticazione, permette di accedere a funzionalità di ricerca film tramite navigazione web e interazione semplice. 

---

## 👩‍💻 Autore
- Realizzato da Stanzione Denise
- **GitHub: [@denisestanzione](https://github.com/denisestanzione)**

--- 

## 📝 Obiettivo del progetto
- Login con validazione di credenziali
- Ricerca e visualizzazione di informazioni su film

---

## 📲 Struttura dell'app

### **Activity 1: Login🔐**

**Layout**
- Due campi **'EditText'** per inserire username e password
- Un bottone per inviare dati
- Un'immagine rappresentativa **(logo cinema)**

**Funzionalità**
- Login basato su coppie hardcoded:
  - User1 / 123  
  - User2 / 456  
  - User3 / 789
- In caso di successo viene mostrato un messaggio di benvenuto e si accede alla schermata principale
- In caso di errore appare un messaggio e i campi si resettano

---

### **Activity 2: Menù principale📄**
Tre bottoni principali per accedere alle varie sezioni dell'app

**Layout**
- 🔎 **SearchActivity**
- 🌐 **WebViewActivity**  
- 🚧 **DashboardActivity** *(non sviluppata)*

**Funzionalità**
- Permette di navigare tra le sezioni attive dell'app tramite **'Intent'**

---

### **Activity 3: Ricerca Film🎥**

**Layout**
- Campo di testo per inserire il nome del film
- Bottone per avviare la ricerca
- Lista dei risultati mostrata in una **'RecyclerView'**

**Funzionalità**
- Integrazione con le API per ottenere informazioni sui film
- Visualizzazione dinamica dei risultati con adattatore personalizzato **(MovieAdapter)**
- Parsing del **JSON** ottenuto tramite **"Gson"**

Questa funzionalità è stata realizzata con il supporto di [@amendola-scuola]

---

### **Activity 4: Navigazione web🌍**

**Funzionalità** 
Consente di aprire un sito we direttamente in-app utilizzando una **'WebView'**

---

### **Activity 5**

**Attualmente non sviluppata** 
Placeholder per future funzionalità RESTful **(es. chiamate API, consumo servizi esterni)**

---

## 🖱Tecnologie utilizzate 
- **Linguaggio:** Kotlin
- **Layout XML:** (ConstraintLayout)
- **Librerie:** Volley **(HTTP)**, Gson **(Parsing JSON)**
- **IDE:** Android Studio

---

## ✔ Installazione
1. Clona il repository:
   ```bash
   https://github.com/denisestanzione/MyRestApp.git
2. Apri il progetto in [**Android Studio**](https://developer.android.com/studio)
3. Collega un emulatore o un dispositivo Android
4. Per avviare l'app premi su **"Run"** ▶

---

## 📉 Funzionalità future 
- Completamento della **'DashboardActivity'**
- Salvataggio locale della cronologia ricerche

---

## 🔄 Stato del progetto
- Alcune sezioni in via di sviluppo























































