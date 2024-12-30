import React,{useState} from "react";

function ImageGenerator(){
    const [prompt, setPrompt] = useState('');
    const[imageUrls, setURLs] = useState([]);
    const generateImage = async () => {
        try {
            const response = await fetch(`http://localhost:8080/generate-image?message=${prompt}`);
            const urls = await response.json();

            // Ensure the response is an array
            if (Array.isArray(urls)) {
                setURLs(urls);
            } else {
                console.error("Error: Response is not an array", urls);
                setURLs([]); // Set to empty array if the response is invalid
            }
        } catch (e) {
            console.error("Error:", e);
            setURLs([]); // Set to empty array in case of an error
        }
    };
    return (
        <div className="tab-content">
            <h2>Generate Image</h2>
            <input
                type="text"
                value={prompt}
                onChange={(e) => setPrompt(e.target.value)}
                placeholder="Enter prompt for image"
            />
            <button onClick={generateImage}>Generate Image</button>

            <div className="image-grid">
                {imageUrls.map((url, index) => (
                    <img key={index} src={url} alt={`Generated ${index}`} />
                ))}
                {[...Array(4 - imageUrls.length)].map((_, index) => (
                    <div key={index + imageUrls.length}
                         className="empty-image-slot"></div>
                ))}
            </div>
        </div>
    );
}

export default ImageGenerator