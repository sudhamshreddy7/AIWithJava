import React,{useState} from "react";
import './App.css';
import ImageGenerator from "./Component/ImageComponent";
import RecipeGenerator from "./Component/RecipeComponent";
import ChatGenerator from "./Component/ChatComponent";

function App() {
  const [activeTab , setActiveTab] = useState('image-generator');
  const handleTabChange = (tab) => {
    // alert(tab)
    setActiveTab(tab)
  };
  return (
    <div className="App">
    <button className={activeTab === 'image-generator' ? 'active' : ''}
        onClick={()=> handleTabChange('image-generator')}>Generate Image</button>
      <button className={activeTab === 'chat' ? 'active' : ''}
          onClick={() => handleTabChange('chat')}>Chat</button>
      <button className={activeTab === 'recipe-generator' ? 'active' : ''}
          onClick={()=> handleTabChange('recipe-generator')}>Recipe Generator</button>
    <div>
      {activeTab === 'image-generator' && <ImageGenerator/>}
      {activeTab === 'chat' && <ChatGenerator/>}
      {activeTab === 'recipe-generator' && <RecipeGenerator/>}
    </div>
    </div>

  );
}

export default App;
