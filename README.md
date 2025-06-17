# product-calculator-manager

## 🇫🇷 Français

### Prérequis

* Java 8 ou supérieur installé
* Un terminal / invite de commandes

> **Astuce** : Avant de lancer les commandes, assurez-vous d'être positionné dans le dossier contenant le fichier `Main.java`.

### Installation & Exécution

1. Récupérez les fichiers (`Main.java` et ce README).
2. Ouvrez un terminal et **placez-vous dans le dossier** où se trouve `Main.java`.
3. Compilez :

   ```bash
   javac Main.java
   ```
4. Exécutez :

   ```bash
   java Main
   ```

### Utilisation

* Au lancement, choisissez votre **type de client** :

  1. **Particulier**
     – Saisissez ID, nom, prénom.
     – Tarifs :

     * Téléphone haut de gamme : **1500 €**
     * Téléphone milieu de gamme : **800 €**
     * Laptop : **1200 €**
  2. **Professionnel**
     – Saisissez ID, raison sociale, TVA (optionnel), SIREN, CA annuel.
     – Tarifs selon CA :

     * **CA > 10 M€** : 1000 €, 550 €, 900 €
     * **CA ≤ 10 M€** : 1150 €, 600 €, 1000 €
* Ensuite, entrez les **quantités** de chaque produit.
* Le programme affiche le **total du panier**.

---

## 🇬🇧 English

### Prerequisites

* Java 8 or higher installed
* A terminal / command prompt

> **Tip**: Before running the commands, make sure you are in the directory containing `Main.java`.

### Install & Run

1. Download the files (`Main.java` and this README).
2. Open a terminal and **cd into the directory** where `Main.java` is located.
3. Compile:

   ```bash
   javac Main.java
   ```
4. Run:

   ```bash
   java Main
   ```

### Usage

* On startup, select your **client type**:

  1. **Individual**
     – Enter client ID, last name, first name.
     – Prices:

     * High-end phone: **€1500**
     * Mid-range phone: **€800**
     * Laptop: **€1200**
  2. **Professional**
     – Enter client ID, company name, VAT number (optional), SIREN, annual revenue.
     – Prices based on revenue:

     * **Revenue > €10M**: €1000, €550, €900
     * **Revenue ≤ €10M**: €1150, €600, €1000
* Then input the **quantities** of each product.
* The program prints the **cart total**.