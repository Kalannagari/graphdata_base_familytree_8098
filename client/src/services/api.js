import { API_BASE_URL } from "../config";

export const fetchFamiliesByVillage = async (village) => {
  const response = await fetch(`${API_BASE_URL}/families/${village}`);
  if (!response.ok) throw new Error("Failed to fetch family records");
  return response.json();
};
