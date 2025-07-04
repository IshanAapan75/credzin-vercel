# Credzin
A comprehensive fintech application for optimizing credit card spends and maximizing reward points earning through intelligent recommendations and spend analysis.
Category: Fintech, Personal Finance, Credit lending, Cibil scores

# 🚀 Features
## MVP Features
- Card Wallet: Add cards in your wallet to get reward suggestions and offers
- Credit Card Recommendation System: Intelligent card suggestions based on user preferences and spending patterns
- Reward Maximizer: Shows all cards ranked by potential rewards
- Spend Analysis: Gmail integration for automatic spend categorization and analysis
- Personalized Recommendations: Based on user's existing cards in the wallet and spending habits
- Card Pool: Make groups of friends and have a card pool for shared spending

## Additional Features
- Chatbot Integration: RAG-powered chatbot for user-card queries
- Content Generation: Auto blogs and biweekly newsletters
- User Engagement: Email nudges and notifications for optimal spending
- Knowledge Base: Comprehensive KB of card details with benefits and features

## More strategic features to enhance Credzin for Indian users
- UPI Integration with Credit Cards
    Enable UPI payments via linked credit cards (NPCI's recent RBI-approved feature)
    Auto-suggest optimal card for UPI transactions based on reward rates

- Sachet EMI Recommendations
    Auto-convert large spends into No-Cost EMIs using card features
    Compare EMI plans across banks in real-time

- FASTag/Utility Wallet
    Link FASTag, electricity/gas accounts to track & pay via optimal reward cards
    Auto-categorize fuel spends for fuel-specific card benefits

- Joint Family Finance Mode
    Multi-generational wallet with spending limits for elders/children
    Inheritance planning for card points/liabilities

- Technical Enhancements
    Bharat BillPay API Integration
    NPCI's Credit Line on UPI Support
    Aadhaar eSign for Card Applications

## Current Architecture
The system is built using a modular architecture with the following components:

## WebApp

## User Flow
- login → personal/salary details → add cards → show recommendations
- gmail consent required for spend analysis, start populating credit card data
- reward maximizer [MVP], can show all the cards based on rank

## Login-Page
Toast for an existing user if the emails is already found during signup

## Home Page
- Make it responsive and mobile friendly

## Profile page
- profile page for a new user
- What's your monthly salary
- How much are your estimated monthly spends
- Skip button
- show all the user details in profile page
- Add home button on profile page and manage cards

## Manage cards page
- Rename the page and routes to wallet
- Add user messages as toast on button clicks
- Add card images in the card list

## Steps to run the web app
Install nodejs in our system
    -BACKEND
        move to WebAPP folder
        then in terminal  cd backend
        run command npm i
        run npm run dev
    -FRONTEND
        Move to WebApp folder
        then in terminal run- cd frontend
        run command npm i
        run command npm run start


## Card Engine 

## Credzin PyCode
create a new log file with date_time for every run and write logs to /output/logs dir
separate log file for each process/module: scraper, data loader, rag & llm  
use relative path everywhere and make sure it runs in all the systems by auto-detection

## Knowledge base
Scrape all the banks
Scrape similar sites
File reader for pdf, md
create a qdrant loader for embeddings
build metadata for all the banks
Scheduler for weekly, monthly data pull
Pull offers data and card eligibilty data 

## Recommendor
Agentify the recommendor
Complete the RAG pipeline for card recommendation
build a chatbot on the KB for user-card random queries
Post generator using KB


# Steps to run the scrapers
# Steps to run the RAG and Agents


## Setup and run code

1. Install dependencies:
```bash
pip install -r requirements.txt
```

2. Set up environment variables:
```bash
# Neo4j settings
_URI=bolt://localhost:7687
_USER=neo4j
_PASSWORD=your_password

# LLM settings
LLM_BASE_URL=http://localhost:11434
LLM_MODEL=llama3.2
```

3. Run tests:
```bash
pytest tests/
```

## Usage


## Testing
The system includes comprehensive tests for each component:


## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License
MIT License 