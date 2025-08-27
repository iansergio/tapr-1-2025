# 🧩 Modelo Tático (Domain Driven Design)

O modelo tático é o nível mais próximo do código. Enquanto o **modelo estratégico** define **onde cada coisa vive** e **como os contextos se relacionam**, o **tático** define **como o domínio é modelado e implementado dentro de cada contexto**.

---

## 📌 O que ele entrega
1. Modelagem clara de **Entidades**, **Agregados** e **Objetos de Valor (VO)**  
2. Organização do código de domínio 
3. Isolamento de regras de negócio
4. Pontos claros de integração via Serviços e Repositórios 

---

## ⚙️ Blocos do Modelo Tático

### 🌱 Agregados
- São **raízes lógicas de consistência**.  
- Um agregado é composto por uma **entidade raiz (aggregate root)** e outros objetos relacionados (**entidades ou objetos de valor**).  
- Garantem regras de consistência: **qualquer modificação deve passar pela raiz**.  

---

### 🆔 Entidades
- Possuem **identidade única** que persiste ao longo do tempo.  
- Mudam de estado, mas sua **identidade permanece a mesma**.  

---

### 🎭 Objetos de Valor (VO)
- **Não** têm identidade própria.  
- São definidos apenas pelos seus atributos.  
- **Imutáveis** → ao alterar, cria-se um novo objeto em vez de modificar o existente.  

---

### ⚡ Serviços de Domínio
- Capturam **regras de negócio que não pertencem a uma única entidade ou agregado**.  
- São operações do domínio que **não se encaixam como comportamento natural de um objeto**.  

---

### 📚 Repositórios
- Interface para **recuperar e persistir agregados**.  
- Se comportam como **coleções em memória**, mas na prática acessam **banco/infraestrutura**.  

---

### 🏭 Fábricas
- Responsáveis por **criar objetos complexos ou agregados inteiros**.  
- Úteis quando a criação exige **lógica elaborada**.  

---

✨ Esse guia serve como **referência rápida** para entender e aplicar os blocos do **Modelo Tático do DDD** no projeto.
