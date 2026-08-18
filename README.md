# ProjectMatch

Uma REST API que realiza matching automático entre freelancers e projetos, analisando tecnologias, experiência e senioridade.

## Objetivo

Conectar freelancers com projetos compatíveis de forma inteligente, calculando um score de compatibilidade baseado em:
- **Tecnologias:**
- **Senioridade:**

## Stack

- **Java 17**
- **Spring Boot**
- **H2 Database**
- **Maven**

## Endpoints

### Freelancers
- `POST /api/freelancers` - Criar novo freelancer
- `GET /api/freelancers/{id}` - Buscar freelancer por ID

### Projetos
- `POST /api/projetos` - Criar novo projeto
- `GET /api/projetos/{id}` - Buscar projeto por ID

### Matching
- `POST /api/recomendacoes?freelancerId=1&projetoId=1` - Calcular compatibilidade

## Como Rodar

### 

### Calcular Matching
```bash
POST http://localhost:8080/api/recomendacoes?freelancerId=1&projetoId=1
```

**Resposta:**
```json
{
    "freelancerId": 1,
    "freelancerNome": "João Silva",
    "freelancerLinguagens": "Java,Spring",
    "freelancerSenioridade": "PLENO",
    "projetoId": 1,
    "projetoTitulo": "API em Java",
    "projetoDescricao": "Preciso de uma API robusta",
    "projetoTecnologiasNecessarias": "Java,Spring",
    "scoreTotal": 100
}
```

## 📚 Aprendizados

Este projeto foi desenvolvido para estudar e praticar:
- Padrões de design em Spring Boot
- Lógica de negócio e algoritmos

## 👤 Autor

**Luan Raphael**
- GitHub: [github.com/LuanRaph](https://github.com/LuanRaph)
- LinkedIn: [linkedin.com/in/luan-raphael](https://linkedin.com/in/luan-raphael-6567313a3)

## 📝 Licença

Este projeto é open source sob a licença MIT.

---

**⭐ Se você achou útil, considere dar uma estrela no repositório!**
